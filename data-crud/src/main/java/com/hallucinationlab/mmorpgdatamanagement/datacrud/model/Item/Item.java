package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.Item;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.bag.Bag;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int level;
    @Column(nullable = false)
    private double dropChance;

    @ManyToOne
    @JoinColumn(name = "bag_id")
    private Bag bag;

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

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return level == item.level && Double.compare(dropChance, item.dropChance) == 0 && Objects.equals(id, item.id) && Objects.equals(name, item.name) && Objects.equals(bag, item.bag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level, dropChance, bag);
    }
}
