package ar.edu.uade.grupo1.backendadminconsorcios.models;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private int id;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "rol")
    private String rol;

    @Column(name = "estado")
    private boolean estado;

//    @OneToOne(mappedBy = "usuario", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
//    private Propietario propietario;
//
//    @OneToOne(mappedBy = "usuario", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
//    private Viviente viviente;
//
    @OneToOne(mappedBy = "usuario", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    private Administrador administrador;
//
//    @OneToOne(mappedBy = "usuario", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
//    private Inspector inspector;

    public Usuario() {

    }

    public Usuario(String username, String email, String rol, boolean estado) {
        this.username = username;
        this.email = email;
        this.rol = rol;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
