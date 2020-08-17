package ar.edu.uade.grupo1.backendadminconsorcios.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Viviente {
    @Id private String idViviente;
    private String tipoDoc;
    private int dni;
    private String nombre;
    private String apellido;
    private Date fechaNac;

    public String getIdViviente() {
        return idViviente;
    }

    public void setIdViviente(String idViviente) {
        this.idViviente = idViviente;
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

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
}
