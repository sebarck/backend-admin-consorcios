package ar.edu.uade.grupo1.backendadminconsorcios.models;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

public class Reclamo {
    @Id private String idReclamo;
    private String categoria; // El Rubro del reclamo, ya sea electricidad, plomeria, etc.
    private String titulo;
    private String descripcion;
    private String estado; //NUEVO, EN CURSO, PENDIENTE APROBACION, RECHAZADO, FINALIZADO
    private String notas;
    private Edificio edificio;
    private Persona solicitante;
    private Inspector inspector;
    private List<byte[]> evidencia; //Ver si lo guardamos aca o no
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaVencimiento; //= this.fechaCreacion.plusDays(5);
    private LocalDateTime fechaComienzoObras;
    private LocalDateTime fechaResolucion;

}
