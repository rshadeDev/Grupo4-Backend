package com.example.grupo4_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "La empresa no puede ser nulo")
    @NotEmpty(message = "La empresa no puede estar vacío")
    @Size(min = 5, max = 255, message = "La empresa debe tener entre 3 y 150 caracteres")
    private String empresa;

    @NotNull(message = "El nombre no puede ser nulo")
    @NotEmpty(message = "El nombre no puede estar vacío")
    @Size(min = 3, max = 50, message = "El nombre debe tener entre 3 y 50 caracteres")
    private String nombre;

    @NotNull(message = "El direccion no puede ser nulo")
    @NotEmpty(message = "El direccion no puede estar vacío")
    @Size(min = 5 , max = 200, message = "La direccion debe tener entre 5 y 200 caracteres")
    private String direccion;

    @NotNull(message = "El ciudad no puede ser nulo")
    @NotEmpty(message = "El ciudad no puede estar vacío")
    @Size(min = 3, max = 100, message = "La ciudad debe tener entre 3 y 100 caracteres")
    private String ciudad;

    @NotNull(message = "El teléfono no puede ser nulo")
    @NotEmpty(message = "El teléfono no puede estar vacío")
    @Pattern(regexp = "^[0-9]{9,12}$", message = "El telefono debe tener entre 9(si es que empieza con +9) y 12 digitos(si es que empieza con +569)")
    private String telefono;

    public Sucursal() {}

    public Sucursal(String nombre, String direccion, String ciudad, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}