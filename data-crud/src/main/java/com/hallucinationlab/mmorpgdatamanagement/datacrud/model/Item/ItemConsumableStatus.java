package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.Item;

import java.util.Objects;

public class ItemConsumableStatus {
    private Long id;
    private Long idItem;

    public ItemConsumableStatus(Long id, Long idItem) {
        this.id = id;
        this.idItem = idItem;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemConsumableStatus that = (ItemConsumableStatus) o;
        return Objects.equals(id, that.id) && Objects.equals(idItem, that.idItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idItem);
    }
}
