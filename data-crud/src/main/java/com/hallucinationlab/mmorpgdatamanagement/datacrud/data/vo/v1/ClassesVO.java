package com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

public class ClassesVO {
    @JsonProperty("Id")
    private UUID id;
    @JsonProperty("Nome")
    private String nome;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassesVO classesVO = (ClassesVO) o;
        return id == classesVO.id && Objects.equals(nome, classesVO.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
