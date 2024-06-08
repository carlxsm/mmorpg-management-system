package com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.classes.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassesRepository extends JpaRepository<Classes, Integer> {
}
