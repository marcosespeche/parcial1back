package com.facu.restfake.controllers;

import com.facu.restfake.services.PersonaService;
import com.facu.restfake.entities.Persona;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/persona")
public class PersonaController extends BaseControllerImpl<Persona, PersonaService>{

    @GetMapping("/search1")
    public ResponseEntity<?> search1(@RequestBody Persona persona) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNombreApellidoJpqlIndex(persona.getNombre(), persona.getApellido()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
    @GetMapping("/search2")
    public ResponseEntity<?> search2(@RequestBody Persona persona) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNombreApellidoJpqlIndex(persona.getNombre(), persona.getApellido()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
    @GetMapping("/search3")
    public ResponseEntity<?> search3(@RequestBody Persona persona) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNombreApellidoJpqlNomb(persona.getNombre(), persona.getApellido()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
    @GetMapping("/search4")
    public ResponseEntity<?> search4(@RequestBody Persona persona) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNombreApellidoNativa(persona.getNombre(), persona.getApellido()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
    @GetMapping("/search4paged")
    public ResponseEntity<?> search4paged(@RequestBody Persona persona, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNombreApellidoNativaPaged(persona.getNombre(), persona.getApellido(), pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
}
