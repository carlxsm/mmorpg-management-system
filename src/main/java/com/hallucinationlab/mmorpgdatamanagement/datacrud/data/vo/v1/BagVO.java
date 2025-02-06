package com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;
import java.util.UUID;

@JsonPropertyOrder({"Id","Size","Available"})
public class BagVO {
    @JsonProperty("Id")
    private UUID id;
    @JsonProperty("Size")
    private Long size;
    @JsonProperty("Available")
    private Long available;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BagVO bagVO = (BagVO) o;
        return id == bagVO.id && size == bagVO.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, size);
    }
}
