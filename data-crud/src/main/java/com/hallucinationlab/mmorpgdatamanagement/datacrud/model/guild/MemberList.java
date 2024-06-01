package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.guild;

import java.util.List;
import java.util.Objects;

public class MemberList {
    private Long id;
    private Long idMember;

    public MemberList(Long id, Long idMember) {
        this.id = id;
        this.idMember = idMember;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdMember() {
        return idMember;
    }

    public void setIdMember(Long idMember) {
        this.idMember = idMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberList that = (MemberList) o;
        return Objects.equals(id, that.id) && Objects.equals(idMember, that.idMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idMember);
    }
}
