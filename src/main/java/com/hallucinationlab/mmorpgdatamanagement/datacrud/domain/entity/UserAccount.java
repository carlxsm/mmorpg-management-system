package com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class UserAccount {

    private static final long SerialVersionUID = 1L;
    @Id
    private long id;
}
