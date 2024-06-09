package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.guild;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.character.Hero;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "tb_guild")
public class Guild implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private LocalDateTime creationDate =  LocalDateTime.now();
    // @Column(nullable = false)
    // private Hero leader

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "guild", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Hero> members = new HashSet<>();

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

    public Set<Hero> getMembers() {
        return members;
    }

    public void setMembers(Set<Hero> members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guild guild = (Guild) o;
        return Objects.equals(id, guild.id) && Objects.equals(name, guild.name) && Objects.equals(description, guild.description) && Objects.equals(creationDate, guild.creationDate) && Objects.equals(members, guild.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, creationDate, members);
    }
}
