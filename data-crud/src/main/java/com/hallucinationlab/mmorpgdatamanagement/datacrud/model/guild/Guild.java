package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.guild;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.character.Hero;
import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_guild")
public class Guild {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private Date creationDate;

    @OneToOne
    private Hero leader;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "guildMember",fetch = FetchType.EAGER)
    private Set<Hero> members = new HashSet<>();

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Hero getLeader() {
        return leader;
    }

    public void setLeader(Hero leader) {
        this.leader = leader;
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
        return Objects.equals(id, guild.id) && Objects.equals(name, guild.name) && Objects.equals(description, guild.description) && Objects.equals(creationDate, guild.creationDate) && Objects.equals(leader, guild.leader) && Objects.equals(members, guild.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, creationDate, leader, members);
    }
}
