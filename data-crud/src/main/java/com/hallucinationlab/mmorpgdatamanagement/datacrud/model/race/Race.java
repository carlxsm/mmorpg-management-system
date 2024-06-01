package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.race;

import java.util.Objects;

public class Race {
    private Long id;
    private String name;

    public Race(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return Objects.equals(id, race.id) && Objects.equals(name, race.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
