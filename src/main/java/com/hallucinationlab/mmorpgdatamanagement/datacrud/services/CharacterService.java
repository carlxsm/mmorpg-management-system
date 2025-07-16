package com.hallucinationlab.mmorpgdatamanagement.datacrud.services;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.dto.request.CharacterCreateRequest;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.exceptions.ResourceNotFoundException;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.mapper.ObjectMapper;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.entity.Character;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.dto.CharacterDTO;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories.CharacterRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

@Service
public class CharacterService {
    private final Logger logger = Logger.getLogger(CharacterService.class.getName());


    @Autowired
    CharacterRepository repository;

    @Transactional
    public CharacterCreateRequest createHero(CharacterCreateRequest characterDTO) {
        logger.info("Bip.. Bop.. Creating a Hero...");
        Character entity = new Character();

        return null;
    }

    public CharacterDTO findHeroById(UUID id) {
        logger.info("Bip.. Bop.. We're loking a Hero...");
        var entity = repository.findById(id).orElseThrow(()->new ResourceNotFoundException("No hero found with id: " + id));
        return ObjectMapper.parseObject(entity, CharacterDTO.class);
    }

    public List<CharacterDTO> findAllHeroes() {
        logger.info("Bip.. Bop.. We're loking all Heroes...");
        //return ObjectMapper.parseListObject(repository.findAll(),HeroVO.class);
        return ObjectMapper.parseListObject(repository.findAll(), CharacterDTO.class);
    }

    @Transactional
    public CharacterDTO updateHero(CharacterDTO characterDTO) {
        logger.info("Bip.. Bop.. Updating Hero...");
        var entity = repository.findById(characterDTO.getId()).orElseThrow(()->new ResourceNotFoundException("No hero found with id: " + characterDTO.getId()));
        logger.info("Bip.. Bop.. We find a Hero!!");
        entity.setName(characterDTO.getName());
        entity.setLevel(characterDTO.getLevel());
        entity.setXp(characterDTO.getXp());
        entity.setHp(characterDTO.getHp());
        entity.setMp(characterDTO.getMp());
        logger.info("Bip.. Bop.. Hero updated!");
        return ObjectMapper.parseObject(repository.save(entity), CharacterDTO.class);
    }

    @Transactional
    public void deleteHero(UUID id) {
        logger.info("Bip.. Bop.. Deleting Hero...");
        var entity = repository.findById(id).orElseThrow(()->new RuntimeException("kkk"));
        repository.delete(entity);
    }

}
