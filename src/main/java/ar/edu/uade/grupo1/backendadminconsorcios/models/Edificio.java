package ar.edu.uade.grupo1.backendadminconsorcios.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "edificios")
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private int id;

    @Column(name = "calle", nullable = false)
    private String calle;

    @Column(name = "altura", nullable = false)
    private int altura;

    @Column(name = "barrio", nullable = false)
    private String barrio;

    @Column(name = "provincia", nullable = false)
    private String provincia;

    @Column(name = "codigo_postal", nullable = false)
    private String codigoPostal;

    @OneToMany(mappedBy = "edificio", cascade = CascadeType.ALL)
    private List<Propiedad> propiedades;

    @JoinColumn(name = "id_administrador")
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Administrador administrador;

    @JoinColumn(name = "id_inspector")
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Inspector inspector;
}