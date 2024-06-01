package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.Item;

import java.util.Objects;

public class ItemArmorStatus {
    private Long id;
    private Long idItem;
    private int defense;

    public ItemArmorStatus(Long id, Long idItem, int defense) {
        this.id = id;
        this.idItem = idItem;
        this.defense = defense;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemArmorStatus that = (ItemArmorStatus) o;
        return defense == that.defense && Objects.equals(id, that.id) && Objects.equals(idItem, that.idItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idItem, defense);
    }
}
