package com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

public class RaceVO {
    @JsonProperty("Id")
    private UUID id;
    @JsonProperty("Name")
    private String name;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
        RaceVO raceVO = (RaceVO) o;
        return Objects.equals(id, raceVO.id) && Objects.equals(name, raceVO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
