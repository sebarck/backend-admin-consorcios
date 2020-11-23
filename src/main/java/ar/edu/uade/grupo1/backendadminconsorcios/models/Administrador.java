package ar.edu.uade.grupo1.backendadminconsorcios.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "administradores")
public class Administrador extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private int id;

    @OneToMany(mappedBy = "administrador", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private List<Edificio> edificios;

    @OneToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario usuario;

    public Administrador() {

    }

    public Administrador(String tipoDoc, int dni, String nombre, String apellido, LocalDate fechaNac, int id) {
        super(tipoDoc, dni, nombre, apellido, fechaNac);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
