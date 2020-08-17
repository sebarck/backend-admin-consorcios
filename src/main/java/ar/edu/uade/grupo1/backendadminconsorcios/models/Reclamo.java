package ar.edu.uade.grupo1.backendadminconsorcios.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Reclamo {
    @Id private String idReclamo;
    private String categoria;
    private String titulo;
    private String descripcion;
    private String estado;
    private Consorcio consorcio;
    private Viviente viviente;
    private Propietario propietario;
    private Inspector inspector;
    private Date fechaCreacion;
    private Date fechaUltCreacion;

    public String getIdReclamo() {
        return idReclamo;
    }

    public void setIdReclamo(String idReclamo) {
        this.idReclamo = idReclamo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Consorcio getConsorcio() {
        return consorcio;
    }

    public void setConsorcio(Consorcio consorcio) {
        this.consorcio = consorcio;
    }

    public Viviente getViviente() {
        return viviente;
    }

    public void setViviente(Viviente viviente) {
        this.viviente = viviente;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Inspector getInspector() {
        return inspector;
    }

    public void setInspector(Inspector inspector) {
        this.inspector = inspector;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaUltCreacion() {
        return fechaUltCreacion;
    }

    public void setFechaUltCreacion(Date fechaUltCreacion) {
        this.fechaUltCreacion = fechaUltCreacion;
    }
}
