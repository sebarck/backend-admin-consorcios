package ar.edu.uade.grupo1.backendadminconsorcios.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Reclamo {
    @Id private String idReclamo;
    private String categoria;
    private String titulo;
    private String descripcion;
    private Consorcio consorcio;
    private Consorcista consorcista;
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

    public Consorcio getConsorcio() {
        return consorcio;
    }

    public void setConsorcio(Consorcio consorcio) {
        this.consorcio = consorcio;
    }

    public Consorcista getConsorcista() {
        return consorcista;
    }

    public void setConsorcista(Consorcista consorcista) {
        this.consorcista = consorcista;
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
