package com.example.demo.controller;


public class mascota {
    private int id;
    private String nombre   ;
    private int edad;
    private String genero;
    private String diagnostico;
    private String fecha_cita;
    private int numero_consultorio;
    private int veterinario_id;
    private int sede_id;


    public mascota (integer id, String nombre, Integer edad, String genero, String diagnostico, String fecha_cita,
                    Integer numero_consultorio, Integer veterinario_id, int sede_id){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero  = genero;
        this.diagnostico = diagnostico;
        this.numero_consultorio = numero_consultorio;
        this.veterinario_id = veterinario_id;
        this.sede_id = sede_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(String fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public int getNumero_consultorio() {
        return numero_consultorio;
    }

    public void setNumero_consultorio(int numero_consultorio) {
        this.numero_consultorio = numero_consultorio;
    }

    public int getVeterinario_id() {
        return veterinario_id;
    }

    public void setVeterinario_id(int veterinario_id) {
        this.veterinario_id = veterinario_id;
    }

    public int getSede_id() {
        return sede_id;
    }

    public void setSede_id(int sede_id) {
        this.sede_id = sede_id;
    }


}
