package com.facu.restfake.services;

import com.facu.restfake.entities.Persona;
import com.facu.restfake.repositories.BaseRepository;
import com.facu.restfake.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService extends BaseServiceImpl<Persona, Long> {
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaService(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository=personaRepository;
    }
}
