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

    public Edificio() {
    }

    public Edificio(String calle, int altura, String barrio, String provincia, String codigoPostal, List<Propiedad> propiedades, Administrador administrador) {
        this.calle = calle;
        this.altura = altura;
        this.barrio = barrio;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.propiedades = propiedades;
        this.administrador = administrador;
    }

    public int getId() {
        return id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(List<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Inspector getInspector() {
        return inspector;
    }

    public void setInspector(Inspector inspector) {
        this.inspector = inspector;
    }
}