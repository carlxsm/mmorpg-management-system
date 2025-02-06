package com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.classes.Classes;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.guild.Guild;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.race.Race;

import java.util.Objects;
import java.util.UUID;

@JsonPropertyOrder({"id","race","classe","name","level","experience","hp","mp","guild"})
public class HeroVO {
    @JsonProperty("id")
    private UUID id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("level")
    private int level;
    @JsonProperty("experience")
    private int xp;
    @JsonProperty("hp")
    private int hp;
    @JsonProperty("mp")
    private int mp;
    @JsonProperty("guild")
    private UUID guild;
    @JsonProperty("race")
    private UUID race;
    @JsonProperty("classe")
    private UUID classe;

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

    public UUID getGuild() {
        return guild;
    }

    public void setGuild(UUID guild) {
        this.guild = guild;
    }

    public UUID getRace() {
        return race;
    }

    public void setRace(UUID race) {
        this.race = race;
    }

    public UUID getClasse() {
        return classe;
    }

    public void setClasse(UUID classe) {
        this.classe = classe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeroVO vo = (HeroVO) o;
        return level == vo.level && xp == vo.xp && hp == vo.hp && mp == vo.mp && Objects.equals(id, vo.id) && Objects.equals(name, vo.name) && Objects.equals(guild, vo.guild) && Objects.equals(race, vo.race) && Objects.equals(classe, vo.classe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level, xp, hp, mp, guild, race, classe);
    }
}
