package com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.enums;

import java.security.Permission;
import java.util.Set;

public enum GuildRole {
    LEADER("Leader",Set.of(GuildPermission.INVITE_MEMBER,GuildPermission.KICK_MEMBER,
            GuildPermission.PROMOTE_MEMBER,GuildPermission.DEMOTE_MEMBER,GuildPermission.EDIT_DESCRIPTION)),
    OFFICER("Officer",Set.of(GuildPermission.INVITE_MEMBER,GuildPermission.KICK_MEMBER,
            GuildPermission.EDIT_DESCRIPTION)),
    MEMBER("Member",Set.of());

    private final String displayName;
    private final Set<GuildPermission> permissions;

    GuildRole(String displayName, Set<GuildPermission> permissions) {
        this.displayName = displayName;
        this.permissions = permissions;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Set<GuildPermission> getPermission() {
        return permissions;
    }
}
