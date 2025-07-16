package com.hallucinationlab.mmorpgdatamanagement.datacrud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;
import java.util.UUID;

@JsonPropertyOrder({"Id","Name","Description","Members"})
public class GuildDTO {
    @JsonProperty("Id")
    private UUID id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Members")
    private int members;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuildDTO guildDTO = (GuildDTO) o;
        return members == guildDTO.members && Objects.equals(id, guildDTO.id) && Objects.equals(name, guildDTO.name) && Objects.equals(description, guildDTO.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, members);
    }
}
