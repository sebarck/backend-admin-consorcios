package ar.edu.uade.grupo1.backendadminconsorcios.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "reclamos")
public class Reclamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private int id;

    @Column(name = "categoria", nullable = false)
    private String categoria;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado; //NUEVO, EN CURSO, PENDIENTE APROBACION, RECHAZADO, FINALIZADO

    @Column(name = "notas", length = 1000)
    private String notas;

    @JoinColumn(name = "id_edificio")
    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Edificio edificio;

    @JoinColumn(name = "id_propiedad")
    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Propiedad propiedad;

    @JoinColumn(name = "id_viviente", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Viviente viviente;

    @JoinColumn(name = "id_inspector")
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Inspector inspector;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Evidencia> evidencias;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;

    @Column(name = "fecha_vencimiento")
    private LocalDate fechaVencimiento; //= this.fechaCreacion.plusDays(5);

    @Column(name = "fecha_comienzo_obras")
    private LocalDate fechaComienzoObras;

    @Column(name = "fecha_resolucion")
    private LocalDate fechaResolucion;

    public Reclamo() {

    }

    public Reclamo(String categoria, String titulo, String descripcion, String estado, Edificio edificio, Propiedad propiedad, Viviente viviente, Inspector inspector, List<Evidencia> evidencias, LocalDateTime fechaCreacion) {
        this.categoria = categoria;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.edificio = edificio;
        this.propiedad = propiedad;
        this.viviente = viviente;
        this.inspector = inspector;
        this.evidencias = evidencias;
        this.fechaCreacion = fechaCreacion;
    }

    public int getId() {
        return id;
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

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public Viviente getViviente() {
        return viviente;
    }

    public void setViviente(Viviente viviente) {
        this.viviente = viviente;
    }

    public Inspector getInspector() {
        return inspector;
    }

    public void setInspector(Inspector inspector) {
        this.inspector = inspector;
    }

    public List<Evidencia> getevidencias() {
        return evidencias;
    }

    public void setevidencias(List<Evidencia> evidencias) {
        this.evidencias = evidencias;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaComienzoObras() {
        return fechaComienzoObras;
    }

    public void setFechaComienzoObras(LocalDate fechaComienzoObras) {
        this.fechaComienzoObras = fechaComienzoObras;
    }

    public LocalDate getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDate fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

}
