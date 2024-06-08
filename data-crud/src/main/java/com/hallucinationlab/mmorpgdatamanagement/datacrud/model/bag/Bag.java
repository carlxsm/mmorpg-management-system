package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.bag;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.Item.Item;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.character.Hero;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_bag")
public class Bag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private int size;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "bag",fetch = FetchType.EAGER)
    private Set<Item> items = new HashSet<>();

    @OneToOne
    @JoinColumn(name = "hero_id")
    private Hero hero;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bag bag = (Bag) o;
        return size == bag.size && Objects.equals(id, bag.id) && Objects.equals(items, bag.items) && Objects.equals(hero, bag.hero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, size, items, hero);
    }
}
