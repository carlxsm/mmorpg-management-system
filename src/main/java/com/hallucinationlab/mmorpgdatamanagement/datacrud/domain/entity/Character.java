package com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.entity;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.enums.CharacterClass;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.enums.CharacterRace;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.enums.GuildRole;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_character")
public class Character implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "name",nullable = false,length = 14)
    private String name;
    @Column(name = "charClass", nullable = false)
    private CharacterClass characterClass;
    @Column(name = "charRace", nullable = false)
    private CharacterRace characterRace;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private UserAccount userAccount;

    @OneToMany(mappedBy = "character",cascade =  CascadeType.ALL, orphanRemoval = true)
    private List<GuildMembership> guildMembership = new ArrayList<>();

    public void joinGuild(Guild guild, GuildRole guildRole) {
        this.guildMembership.clear();
        GuildMembership guildMembership = new GuildMembership(this, guild, guildRole);
        this.guildMembership.add(guildMembership);
        guild.addMember(guildMembership);
    }

    public void leaveGuild(){
        if(!this.guildMembership.isEmpty()){
            GuildMembership member = this.guildMembership.get(0);
            member.getGuild().removeMember(member);
            this.guildMembership.clear();

        }
    }


}
