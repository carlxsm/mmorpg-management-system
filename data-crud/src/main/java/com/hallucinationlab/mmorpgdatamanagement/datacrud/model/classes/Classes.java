package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.classes;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.character.Hero;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tb_class")
public class Classes implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String name;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "classes", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Hero> hero = new HashSet<>();

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
        Classes classes = (Classes) o;
        return Objects.equals(id, classes.id) && Objects.equals(name, classes.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
