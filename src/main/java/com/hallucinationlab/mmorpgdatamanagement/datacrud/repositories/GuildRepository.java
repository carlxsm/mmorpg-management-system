package com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.entity.Guild;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GuildRepository extends JpaRepository<Guild, UUID> {
}
