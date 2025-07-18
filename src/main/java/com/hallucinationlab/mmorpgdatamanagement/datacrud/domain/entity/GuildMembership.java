package com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.entity;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.enums.GuildPermission;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.enums.GuildRole;
import jakarta.persistence.*;

@Entity
public class GuildMembership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "guild_id", nullable = false)
    private Guild guild;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_name",nullable = false)
    private GuildRole role;

    public GuildMembership(){}

    public GuildMembership(Character character, Guild guild, GuildRole role) {
        this.character = character;
        this.guild = guild;
        this.role = role;
    }

    public boolean hasPermission(GuildPermission permission) {
        return this.role.getPermission().contains(permission);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public GuildRole getRole() {
        return role;
    }

    public void setRole(GuildRole role) {
        this.role = role;
    }
}
