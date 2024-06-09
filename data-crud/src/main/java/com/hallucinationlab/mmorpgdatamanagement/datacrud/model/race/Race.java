package com.hallucinationlab.mmorpgdatamanagement.datacrud.model.race;

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
@Table(name = "tb_race")
public class Race implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String name;
//    @OneToOne
//    @JoinColumn(name = "hero_id")
//    private Hero hero;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "race", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
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
        Race race = (Race) o;
        return Objects.equals(id, race.id) && Objects.equals(name, race.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
