package ar.edu.uade.grupo1.backendadminconsorcios.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "vivientes")
public class Viviente extends Persona {

    @JoinColumn(name = "id_propiedad")
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Propiedad propiedad;

    @OneToMany(mappedBy = "viviente", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Reclamo> reclamos;

    public Viviente() {

    }

    public Viviente(String tipoDoc, int dni, String nombre, String apellido, LocalDate fechaNac, Propiedad propiedad) {
        super(tipoDoc, dni, nombre, apellido, fechaNac);
        this.propiedad = propiedad;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public List<Reclamo> getReclamos() {
        return reclamos;
    }

    public void setReclamos(List<Reclamo> reclamos) {
        this.reclamos = reclamos;
    }
}
