package com.hallucinationlab.mmorpgdatamanagement.datacrud.controllers;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v1.HeroVO;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v2.HeroVO2;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.services.HeroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("avalon/api/character")
public class HeroController {

    @Autowired
    private HeroServices service;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public HeroVO2 createHero(@RequestBody HeroVO hero) {
        return service.createHero(hero);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public List<HeroVO> findAllHeroes(){
        return service.findAllHeroes();
    }

    @GetMapping(value = "/{id}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public HeroVO findHeroById(@PathVariable(value = "id") UUID id){
        return service.findHeroById(id);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
                produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public HeroVO updateHero(@RequestBody HeroVO hero){
        return service.updateHero(hero);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> deleteHero(@PathVariable UUID id){
        service.deleteHero(id);
        return ResponseEntity.noContent().build(); // 204
    }
}
