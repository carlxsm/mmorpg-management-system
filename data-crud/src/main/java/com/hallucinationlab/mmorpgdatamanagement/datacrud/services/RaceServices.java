package com.hallucinationlab.mmorpgdatamanagement.datacrud.services;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RaceServices {

    @Autowired
    private RaceRepository repository;

    public String getNameById(UUID id){
        return repository.findRaceNameById(id);
    }

}
