package com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_hero")
public class Character implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "name",nullable = false,length = 14)
    private String name;
    @Column(name = "level",nullable = false)
    private int level;
    @Column(name = "xp",nullable = false)
    private int xp;
    @Column(name = "health",nullable = false)
    private int hp;
    @Column(name = "mana",nullable = false)
    private int mp;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="bag_id")
    private Bag bag;


    @ManyToOne
    @JoinColumn(name = "class_id")
    private Classes classes;

    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race race;

    @ManyToOne(optional = true)
    @JoinColumn(name = "guild_id")
    private Guild guild;

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

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Guild getGuildMember() {
        return guild;
    }

    public void setGuildMember(Guild guildMember) {
        this.guild = guildMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return level == character.level && xp == character.xp && hp == character.hp && mp == character.mp && Objects.equals(id, character.id) && Objects.equals(name, character.name) && Objects.equals(bag, character.bag) && Objects.equals(classes, character.classes) && Objects.equals(race, character.race) && Objects.equals(guild, character.guild);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level, xp, hp, mp, bag, classes, race, guild);
    }
}
