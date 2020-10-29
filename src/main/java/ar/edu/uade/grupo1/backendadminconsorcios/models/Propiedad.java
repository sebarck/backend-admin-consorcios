package ar.edu.uade.grupo1.backendadminconsorcios.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "propiedades")
public class Propiedad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private int id;

    @Column(name = "piso")
    private int piso;

    @Column(name = "unidad")
    private String unidad;

    @JoinColumn(name = "id_edificio", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Edificio edificio;

    @JoinColumn(name = "id_propietario", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Propietario propietario;

    @OneToMany(mappedBy = "propiedad", cascade = CascadeType.MERGE)
    private List<Viviente> vivientes;

    public Propiedad() {
    }

    public Propiedad(Edificio edificio, int piso, String unidad, Propietario propietario) {
        this.edificio = edificio;
        this.piso = piso;
        this.unidad = unidad;
        this.propietario = propietario;
    }

    public int getId() {
        return id;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
