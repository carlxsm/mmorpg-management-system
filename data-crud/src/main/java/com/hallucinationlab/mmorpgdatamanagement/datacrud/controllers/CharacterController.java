package com.hallucinationlab.mmorpgdatamanagement.datacrud.controllers;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v1.HeroVO;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.services.HeroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("avalon/api/character")
public class CharacterController {

    @Autowired
    private HeroServices service;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public HeroVO createHero(@RequestBody HeroVO hero) {
        return service.createHero(hero);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public List<HeroVO> findAllHeroes(){
        return service.findAllHeroes();
    }

    @GetMapping(value = "/{id}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public HeroVO findHeroById(@PathVariable(value = "id") Long id){
        return service.findHeroById(id);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
                produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public HeroVO updateHero(@RequestBody HeroVO hero){
        return service.updateHero(hero);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> deleteHero(@PathVariable Long id){
        service.deleteHero(id);
        return ResponseEntity.noContent().build(); // 204
    }
}
