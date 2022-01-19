package com.example.persona.Controllers;

import com.example.persona.entities.Autor;
import com.example.persona.entities.Persona;
import com.example.persona.services.AutorServiceImpl;
import com.example.persona.services.PersonaServicesImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
}
