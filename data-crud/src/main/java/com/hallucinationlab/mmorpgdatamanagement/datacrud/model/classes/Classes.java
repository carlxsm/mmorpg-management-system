package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.classes;

import java.util.Objects;

public class Classes {
    private Long id;
    private String name;

    public Classes(Long id, String name) {
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
        Classes classes = (Classes) o;
        return Objects.equals(id, classes.id) && Objects.equals(name, classes.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
