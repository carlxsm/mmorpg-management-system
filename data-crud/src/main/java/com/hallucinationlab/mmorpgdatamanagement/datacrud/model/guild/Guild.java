package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.guild;

import java.util.Date;
import java.util.Objects;

public class Guild {
    private Long id;
    private Long idLeader;
    private Long idMemberList;
    private String name;
    private String description;
    private Date creationDate;

    public Guild(Long id, Long idLeader, Long idMemberList, String name, String description, Date creationDate) {
        this.id = id;
        this.idLeader = idLeader;
        this.idMemberList = idMemberList;
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdLeader() {
        return idLeader;
    }

    public void setIdLeader(Long idLeader) {
        this.idLeader = idLeader;
    }

    public Long getIdMemberList() {
        return idMemberList;
    }

    public void setIdMemberList(Long idMemberList) {
        this.idMemberList = idMemberList;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guild guild = (Guild) o;
        return Objects.equals(id, guild.id) && Objects.equals(idLeader, guild.idLeader) && Objects.equals(idMemberList, guild.idMemberList) && Objects.equals(name, guild.name) && Objects.equals(description, guild.description) && Objects.equals(creationDate, guild.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idLeader, idMemberList, name, description, creationDate);
    }
}
