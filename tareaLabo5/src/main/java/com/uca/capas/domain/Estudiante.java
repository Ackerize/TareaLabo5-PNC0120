package com.uca.capas.domain;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


@Entity
@Table(schema = "public", name = "estudiante")
public class Estudiante {
	
    @Id
    @Column(name = "c_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @NotEmpty(message = "El campo nombre no puede estar vacio")
    @Column(name = "nombre")
    private String nombre;
    
    @NotEmpty(message = "El campo apellido no puede estar vacio")
    @Column(name = "apellido")
    private String apellido;
    
    @Pattern(regexp = "^[0-9]{8}$", message = "El carnet debe de tener exactamente 8 digitos")
    @Column(name = "carne")
    private String carne;
    
    @NotEmpty(message = "El campo carrera no puede estar vacio")
    @Column(name = "carrera")
    private String carrera;
    
    public Estudiante(){}

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carreran) {
        this.carrera = carreran;
    }
}
