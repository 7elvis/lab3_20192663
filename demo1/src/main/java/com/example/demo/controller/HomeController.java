package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.ArrayList;

@Controller
public class HomeController {
    @RequestMapping(value = {"/holaMundo"}, method = RequestMethod.GET)
    public String holaMundo (){
        return "hola";
    }


    @GetMapping("/persona")
    public String unaPersona(Model model){
        Persona persona = new Persona("Juan", "Perez", "12345678", 20);
        model.addAttribute("persona", persona);
        return "persona";
    }

    @GetMapping("/listaPersonas")
    public String listaPersonas(Model model){
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Juan", "Perez", "12345678", 20));
        listaPersonas.add(new Persona("Carlos", "Mencia", "85695489", 35));
        listaPersonas.add(new Persona("Andrea", "Garcia", "75856985", 30));
        model.addAttribute("listaPersonas", listaPersonas);
        return "persona1";
    }

    @GetMapping("/persona2")
    public String formularioPersona (Model model){
        Persona persona3 = new Persona();
        model.addAttribute("persona", persona3);
        return "formulario";
    }


    @PostMapping("/persona2/guardar")
    public String guardarPersona( Persona persona){
        System.out.println("Nombre: " + persona.getNombre() + "\n" +
                "Apellido: " + persona.getApellido() + "\n" +
                "Dni: " + persona.getDni() + "\n" +
                "Edad: " + persona.getEdad());
        return "formulario";
    }

}
