package com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonPropertyOrder({"ID","Name","Level","Experience","HP","MP"})
public class HeroVO {
    @JsonProperty("ID")
    private Long id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Level")
    private int level;
    @JsonProperty("Experience")
    private int xp;
    @JsonProperty("HP")
    private int hp;
    @JsonProperty("MP")
    private int mp;

    public HeroVO() {}

    public HeroVO(Long id, String name, int level, int xp, int hp, int mp) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.xp = xp;
        this.hp = hp;
        this.mp = mp;
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
        HeroVO heroVO = (HeroVO) o;
        return level == heroVO.level && xp == heroVO.xp && hp == heroVO.hp && mp == heroVO.mp && Objects.equals(id, heroVO.id) && Objects.equals(name, heroVO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level, xp, hp, mp);
    }
}
