package ar.edu.uade.grupo1.backendadminconsorcios.models;

import javax.persistence.*;

@Entity
@Table(name = "evidencias")
public class Evidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private int id;

    @Lob
    @Column(name = "imagen", columnDefinition = "LONGBLOB")
    private String imagen;

    public Evidencia() {
    }

    public Evidencia(int id, String imagen) {
        this.id = id;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
