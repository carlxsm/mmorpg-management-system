package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.Item;

import java.util.Objects;

public class Item {
    private Long id;
    private String name;
    private int level;
    private double dropChance;

    public Item(Long id, String name, int level, double dropChance) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.dropChance = dropChance;
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
        Item item = (Item) o;
        return level == item.level && Double.compare(dropChance, item.dropChance) == 0 && Objects.equals(id, item.id) && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level, dropChance);
    }
}
