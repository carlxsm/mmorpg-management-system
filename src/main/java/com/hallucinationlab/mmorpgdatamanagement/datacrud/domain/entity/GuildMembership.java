package com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.entity;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.enums.GuildPermission;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.enums.GuildRole;
import jakarta.persistence.*;

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

    public boolean hasPermission(GuildPermission permission) {
        return this.role.getPermission().contains(permission);
    }

}
