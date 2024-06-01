package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.race;

import java.util.Objects;

public class Race_character {
    private Long id;
    private Long idCharacter;
    private Long idRace;

    public Race_character(Long id, Long idCharacter, Long idRace) {
        this.id = id;
        this.idCharacter = idCharacter;
        this.idRace = idRace;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCharacter() {
        return idCharacter;
    }

    public void setIdCharacter(Long idCharacter) {
        this.idCharacter = idCharacter;
    }

    public Long getIdRace() {
        return idRace;
    }

    public void setIdRace(Long idRace) {
        this.idRace = idRace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race_character that = (Race_character) o;
        return Objects.equals(id, that.id) && Objects.equals(idCharacter, that.idCharacter) && Objects.equals(idRace, that.idRace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idCharacter, idRace);
    }
}
