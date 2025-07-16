package com.hallucinationlab.mmorpgdatamanagement.datacrud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

public class ItemDTO {
    @JsonProperty("Id")
    private UUID id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Level")
    private int level;
    @JsonProperty("Drop")
    private double dropChance;

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getDropChance() {
        return dropChance;
    }

    public void setDropChance(double dropChance) {
        this.dropChance = dropChance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemDTO itemDTO = (ItemDTO) o;
        return level == itemDTO.level && Double.compare(dropChance, itemDTO.dropChance) == 0 && Objects.equals(id, itemDTO.id) && Objects.equals(name, itemDTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level, dropChance);
    }
}
