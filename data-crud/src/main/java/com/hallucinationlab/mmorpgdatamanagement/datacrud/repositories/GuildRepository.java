package com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.guild.Guild;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GuildRepository extends JpaRepository<Guild, UUID> {
}
