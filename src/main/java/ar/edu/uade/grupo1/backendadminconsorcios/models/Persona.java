package ar.edu.uade.grupo1.backendadminconsorcios.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Persona {
    @Id
    private ObjectId _id;

    private String tipoDoc;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDateTime fechaNac;

    public Persona() {

    }

    public Persona(String tipoDoc, int dni, String nombre, String apellido, LocalDateTime fechaNac) {
        this.tipoDoc = tipoDoc;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDateTime getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDateTime fechaNac) {
        this.fechaNac = fechaNac;
    }
}
