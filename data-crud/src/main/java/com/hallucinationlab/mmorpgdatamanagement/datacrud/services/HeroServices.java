package com.hallucinationlab.mmorpgdatamanagement.datacrud.services;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.exceptions.ResourceNotFoundException;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.mapper.ObjectMapper;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.character.Hero;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v1.HeroVO;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class HeroServices {
    private final Logger logger = Logger.getLogger(HeroServices.class.getName());


    @Autowired
    CharacterRepository repository;

    public HeroVO createHero(HeroVO heroVO) {
        logger.info("Bip.. Bop.. Creating a Hero...");
        var entity = ObjectMapper.parseObject(heroVO,Hero.class);
        return ObjectMapper.parseObject(repository.save(entity),HeroVO.class);
    }

    public HeroVO findHeroById(Long id) {
        logger.info("Bip.. Bop.. We're loking a Hero...");
        var entity = repository.findById(id).orElseThrow(()->new ResourceNotFoundException("No hero found with id: " + id)); ;
        return ObjectMapper.parseObject(entity,HeroVO.class);
    }

    public List<HeroVO> findAllHeroes() {
        logger.info("Bip.. Bop.. We're loking all Heroes...");
        //return ObjectMapper.parseListObject(repository.findAll(),HeroVO.class);
        return ObjectMapper.parseListObject(repository.findAll(),HeroVO.class);
    }

    public HeroVO updateHero(HeroVO heroVO) {
        logger.info("Bip.. Bop.. Updating Hero...");
        var entity = repository.findById(heroVO.getId()).orElseThrow(()->new ResourceNotFoundException("No hero found with id: " + heroVO.getId()));
        logger.info("Bip.. Bop.. We find a Hero!!");
        entity.setName(heroVO.getName());
        entity.setLevel(heroVO.getLevel());
        entity.setXp(heroVO.getXp());
        entity.setHp(heroVO.getHp());
        entity.setMp(heroVO.getMp());
        logger.info("Bip.. Bop.. Hero updated!");
        return ObjectMapper.parseObject(repository.save(entity),HeroVO.class);
    }

    public void deleteHero(Long id) {
        logger.info("Bip.. Bop.. Deleting Hero...");
        var entity = repository.findById(id).orElseThrow(()->new RuntimeException("kkk"));
        repository.delete(entity);
    }

}
