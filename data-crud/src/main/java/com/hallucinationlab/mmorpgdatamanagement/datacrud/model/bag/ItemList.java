package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.bag;

import java.util.Objects;

public class ItemList {
    private Long id;
    private Long idItem;

    public ItemList(Long id, Long idItem) {
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
        ItemList itemList = (ItemList) o;
        return Objects.equals(id, itemList.id) && Objects.equals(idItem, itemList.idItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idItem);
    }
}
