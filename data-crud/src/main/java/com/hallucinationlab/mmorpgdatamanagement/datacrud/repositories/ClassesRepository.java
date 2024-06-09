package com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.classes.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface ClassesRepository extends JpaRepository<Classes, UUID> {

    @Query("SELECT e.name FROM Classes e WHERE e.id = :id")
    String findClassesNameById(@Param("id") UUID id);
}
