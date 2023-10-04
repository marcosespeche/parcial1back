package com.facu.restfake.controllers;

import com.facu.restfake.services.PersonaService;
import com.facu.restfake.entities.Persona;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/persona")
public class PersonaController extends BaseControllerImpl<Persona, PersonaService>{
}
