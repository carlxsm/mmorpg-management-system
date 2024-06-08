package com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.bag.Bag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BagRepository extends JpaRepository<Bag, Long> {
}
