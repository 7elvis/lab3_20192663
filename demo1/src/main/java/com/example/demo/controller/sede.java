package com.example.demo.controller;


public class sede {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;



    public sede (Integer edad, String nombre, String direccion, String telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public sede(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
