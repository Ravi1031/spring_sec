package org.rvsec.sec02.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "auth")
public class Authorities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "auth_id", nullable = false)
    private Long authId;

    private String name;

    @ManyToMany(mappedBy = "authorities")
    private Set<User> user;

}
