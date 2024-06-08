package com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.race.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<Race, Integer> {
}
