package com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.bag.Bag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BagRepository extends JpaRepository<Bag, UUID> {
}
