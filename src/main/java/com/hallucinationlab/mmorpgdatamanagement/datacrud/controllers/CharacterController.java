package com.hallucinationlab.mmorpgdatamanagement.datacrud.controllers;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.dto.CharacterDTO;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.dto.request.CharacterCreateRequest;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("avalon/api/character")
public class CharacterController {

    @Autowired
    private CharacterService service;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public CharacterCreateRequest createRequest(@RequestBody CharacterCreateRequest characterCreateRequest) {
        return service.createHero(characterCreateRequest);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public List<CharacterDTO> findAllHeroes(){
        return service.findAllHeroes();
    }

    @GetMapping(value = "/{id}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public CharacterDTO findHeroById(@PathVariable(value = "id") UUID id){
        return service.findHeroById(id);
    }

    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
                produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public CharacterDTO updateHero(@RequestBody CharacterDTO hero){
        return service.updateHero(hero);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> deleteHero(@PathVariable UUID id){
        service.deleteHero(id);
        return ResponseEntity.noContent().build(); // 204
    }
}
