package com.sendriods.demo.Domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "director")
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "directorId")
    private int directorId;

    @OneToOne(mappedBy = "director", cascade = CascadeType.PERSIST)
    private Division division;

}
