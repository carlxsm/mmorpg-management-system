package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.classes;

import java.util.Objects;

public class ClassCharacter {
    private Long id;
    private Long idCharacter;
    private Long classes;

    public ClassCharacter(Long id, Long idCharacter, Long classes) {
        this.id = id;
        this.idCharacter = idCharacter;
        this.classes = classes;
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

    public Long getClasses() {
        return classes;
    }

    public void setClasses(Long classes) {
        this.classes = classes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassCharacter that = (ClassCharacter) o;
        return Objects.equals(id, that.id) && Objects.equals(idCharacter, that.idCharacter) && Objects.equals(classes, that.classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idCharacter, classes);
    }
}
