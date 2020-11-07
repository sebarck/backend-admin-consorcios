package ar.edu.uade.grupo1.backendadminconsorcios.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "propietarios")
public class Propietario extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private int id;

    @OneToMany(mappedBy = "propietario", cascade = CascadeType.ALL)
    private List<Propiedad> propiedades;

    public Propietario() {

    }

    public Propietario(String tipoDoc, int dni, String nombre, String apellido, LocalDate fechaNac, int id) {
        super(tipoDoc, dni, nombre, apellido, fechaNac);
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
