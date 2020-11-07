package ar.edu.uade.grupo1.backendadminconsorcios.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "vivientes")
public class Viviente extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private int id;

    @JoinColumn(name = "id_propiedad")
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Propiedad propiedad;

    @OneToMany(mappedBy = "viviente", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    private List<Reclamo> reclamos;

    public Viviente() {

    }

    public Viviente(String tipoDoc, int dni, String nombre, String apellido, LocalDate fechaNac, int id, Propiedad propiedad) {
        super(tipoDoc, dni, nombre, apellido, fechaNac);
        this.id = id;
        this.propiedad = propiedad;
    }

    public int getId() {
        return id;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

}
