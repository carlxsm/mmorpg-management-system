package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.character;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.bag.Bag;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.classes.Classes;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.guild.Guild;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.race.Race;
import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_hero")
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    @OneToOne(mappedBy = "hero",cascade = CascadeType.ALL)
    private Bag bag;
    @OneToOne
    private Classes classes;
    @OneToOne
    private Race race;

    @OneToOne
    @JoinColumn(name = "guild_id_1")
    private Guild guild;

    @ManyToOne
    @JoinColumn(name = "guild_member_id")
    private Guild guildMember;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero character = (Hero) o;
        return level == character.level && xp == character.xp && hp == character.hp && mp == character.mp && Objects.equals(id, character.id) && Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level, xp, hp, mp);
    }
}
