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


    @GetMapping(value = {"/list", ""})
    public String listarSedes(Model model) {

        List<Sede> lista = veterinariaRepository.findAll();
        model.addAttribute("veterinariaList", lista);

        return "veterinaria/list";
    }

}
