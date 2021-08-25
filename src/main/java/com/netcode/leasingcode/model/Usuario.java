package com.netcode.leasingcode.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false, unique = true)
    private String username;

    @Column(name = "clave")
    private String password;
    private String estado;
    private List<Rol> roles;
}
