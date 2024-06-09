package com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class RoleVO {
    @JsonProperty("Id")
    private Long id;
    @JsonProperty("Name")
    private String name;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleVO roleVO = (RoleVO) o;
        return Objects.equals(id, roleVO.id) && Objects.equals(name, roleVO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
