package com.hallucinationlab.mmorpgdatamanagement.datacrud.services;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ClassesServices {

    @Autowired
    private ClassesRepository repository;

    private String getNameById(UUID id){
        return repository.findClassesNameById(id);
    }

}
