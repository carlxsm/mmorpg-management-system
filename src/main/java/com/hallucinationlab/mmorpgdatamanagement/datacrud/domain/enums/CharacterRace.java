package com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.enums;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum CharacterRace {
    HUMANO, ELFO,ANAO
}

@Enumerated(EnumType.STRING)
private CharacterRace race;