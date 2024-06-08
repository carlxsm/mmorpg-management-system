package com.hallucinationlab.mmorpgdatamanagement.datacrud.repositories;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
