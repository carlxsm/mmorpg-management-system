package com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.race.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface RaceRepository extends JpaRepository<Race, UUID> {

    @Query("SELECT e.name FROM Race e WHERE e.id = :id")
    String findRaceNameById(@Param("id") UUID id);

}
