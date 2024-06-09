package com.hallucinationlab.mmorpgdatamanagement.datacrud.services;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v2.HeroVO2;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.exceptions.ResourceNotFoundException;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.mapper.ObjectMapper;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.character.Hero;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v1.HeroVO;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories.ClassesRepository;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories.HeroRepository;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories.RaceRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

@Service
public class HeroServices {
    private final Logger logger = Logger.getLogger(HeroServices.class.getName());


    @Autowired
    HeroRepository repository;
    @Autowired
    RaceRepository raceRepository;
    @Autowired
    ClassesRepository classesRepository;

    @Transactional
    public HeroVO2 createHero(HeroVO heroVO) {
        logger.info("Bip.. Bop.. Creating a Hero...");
        Hero entity = new Hero();

        entity.setName(heroVO.getName());
        entity.setLevel(heroVO.getLevel());
        entity.setXp(heroVO.getXp());
        entity.setHp(heroVO.getHp());
        entity.setMp(heroVO.getMp());
        entity.setClasses(classesRepository.findById(heroVO.getClasse()).orElseThrow());
        entity.setRace(raceRepository.findById(heroVO.getRace()).orElseThrow());

        var savedHero = ObjectMapper.parseObject(repository.save(entity), HeroVO2.class) ;
        savedHero.setRace(raceRepository.findRaceNameById(heroVO.getRace()));
        savedHero.setClasse(classesRepository.findClassesNameById(heroVO.getClasse()));
        logger.info("class : " +savedHero.getClasse());
        logger.info("race : "+savedHero.getRace());
        return savedHero;
    }

    public HeroVO findHeroById(UUID id) {
        logger.info("Bip.. Bop.. We're loking a Hero...");
        var entity = repository.findById(id).orElseThrow(()->new ResourceNotFoundException("No hero found with id: " + id));
        return ObjectMapper.parseObject(entity,HeroVO.class);
    }

    public List<HeroVO> findAllHeroes() {
        logger.info("Bip.. Bop.. We're loking all Heroes...");
        //return ObjectMapper.parseListObject(repository.findAll(),HeroVO.class);
        return ObjectMapper.parseListObject(repository.findAll(),HeroVO.class);
    }

    @Transactional
    public HeroVO updateHero(HeroVO heroVO) {
        logger.info("Bip.. Bop.. Updating Hero...");
        var entity = repository.findById(heroVO.getId()).orElseThrow(()->new ResourceNotFoundException("No hero found with id: " + heroVO.getId()));
        logger.info("Bip.. Bop.. We find a Hero!!");
        entity.setName(heroVO.getName());
        entity.setLevel(heroVO.getLevel());
        entity.setXp(heroVO.getXp());
        entity.setHp(heroVO.getHp());
        entity.setMp(heroVO.getMp());
        entity.setClasses(classesRepository.findById(heroVO.getClasse()).orElseThrow());
        entity.setRace(raceRepository.findById(heroVO.getRace()).orElseThrow());
        logger.info("Bip.. Bop.. Hero updated!");
        return ObjectMapper.parseObject(repository.save(entity),HeroVO.class);
    }

    @Transactional
    public void deleteHero(UUID id) {
        logger.info("Bip.. Bop.. Deleting Hero...");
        var entity = repository.findById(id).orElseThrow(()->new RuntimeException("kkk"));
        repository.delete(entity);
    }

}
