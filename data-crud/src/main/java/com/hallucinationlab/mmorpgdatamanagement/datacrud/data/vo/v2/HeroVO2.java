package com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v2;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;
import java.util.UUID;

@JsonPropertyOrder({"id","name","level","guild","race","classe"})
public class HeroVO2 {

    @JsonProperty("id")
    private UUID id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("level")
    private int level;
    @JsonProperty("guild")
    private String guild;
    @JsonProperty("race")
    private String race;
    @JsonProperty("classe")
    private String classe;

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

    public String getGuild() {
        return guild;
    }

    public void setGuild(String guild) {
        this.guild = guild;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeroVO2 heroVO2 = (HeroVO2) o;
        return level == heroVO2.level && Objects.equals(id, heroVO2.id) && Objects.equals(name, heroVO2.name) && Objects.equals(guild, heroVO2.guild) && Objects.equals(race, heroVO2.race) && Objects.equals(classe, heroVO2.classe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level, guild, race, classe);
    }
}
