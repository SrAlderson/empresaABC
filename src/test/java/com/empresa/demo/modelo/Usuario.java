package com.empresa.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Librerias

@Entity
@Table(name="usuarios")

public class Usuario {
    //Atributos del usuario
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Esto con el fin de poder realizar de manera automatica la asignacion de un ID
    private int id; 
    private String nombre; 
    private String apellido; 
    private String direccion;
    private String correo;
    private int cedula;

    //Generacion del Metodo constructor

    public Usuario(String nombre, String apellido, String direccion, String correo, int cedula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.cedula = cedula;
    }

    //Generacion de Get
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getCorreo(){
        return correo;
    }
    public int getCedula(){
        return cedula;
    }
    //Generacion de Set
    public void setId(int id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setDireccion (String direcccion){
        this.direccion = direcccion;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public void setCedula (int cedula){
        this.cedula = cedula;
    }
}
