package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.bag;

import java.util.Objects;

public class Bag {
    private Long id;
    private Long idCharacter;
    private Long idItemList;
    private int size;

    public Bag(Long id, Long idCharacter, Long idItemList, int size) {
        this.id = id;
        this.idCharacter = idCharacter;
        this.idItemList = idItemList;
        this.size = size;
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

    public Long getIdItemList() {
        return idItemList;
    }

    public void setIdItemList(Long idItemList) {
        this.idItemList = idItemList;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bag bag = (Bag) o;
        return size == bag.size && Objects.equals(id, bag.id) && Objects.equals(idCharacter, bag.idCharacter) && Objects.equals(idItemList, bag.idItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idCharacter, idItemList, size);
    }
}
