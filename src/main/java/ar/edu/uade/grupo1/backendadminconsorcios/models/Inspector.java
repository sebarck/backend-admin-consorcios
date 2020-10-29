package ar.edu.uade.grupo1.backendadminconsorcios.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "inspectores")
public class Inspector extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private int id;

    @Column(name = "especialidades")
    private String especialidades;

    @OneToMany(mappedBy = "inspector", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Edificio> edificios;

    public Inspector(int id, String especialidades) {
        this.id = id;
        this.especialidades = especialidades;
    }

    public Inspector(String tipoDoc, int dni, String nombre, String apellido, LocalDate fechaNac, int id, String especialidades) {
        super(tipoDoc, dni, nombre, apellido, fechaNac);
        this.id = id;
        this.especialidades = especialidades;
    }

    public int getId() {
        return id;
    }

    public List<Edificio> getEdificios() {
        return edificios;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }
}
