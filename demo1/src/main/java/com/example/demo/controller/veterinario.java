package com.example.demo.controller;


public class veterinario {
    private int id;
    private String nombre;
    private String correo;
    private int sede_id;



    public Persona (Integer id, String nombre, String correo, Integer sede_id){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.sede_id = sede_id;
    }

    public veterinario(){
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSede_id() {
        return sede_id;
    }

    public void setSede_id(int sede_id) {
        this.sede_id = sede_id;
    }
}
