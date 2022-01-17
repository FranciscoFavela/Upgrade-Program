package com.example.persona.services;

import com.example.persona.entities.Persona;
import com.example.persona.repositories.PersonaRepository;
import org.hibernate.envers.Audited;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaServices implements BaseService<Persona>{
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServices(PersonaRepository personaRepository){
        this.personaRepository=personaRepository;
    }

    @Override
    @Transactional
    public List<Persona> findAll() throws Exception {
        try {
        List<Persona> entities = personaRepository.findAll();
        return entities;

        } catch (Exception e) {
        throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public Persona findById(Long id) throws Exception {
        try {
            Optional<Persona> entityOptional = personaRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona save(Persona entity) throws Exception {
        try {
        entity=personaRepository.save(entity);
        return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona update(long id, Persona entity) throws Exception {
        try {
            Optional<Persona> entityOpcional =personaRepository.findById(id);
            Persona persona = entityOpcional.get();
            persona=personaRepository.save(entity);
            return persona;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public boolean delete(long id) throws Exception {
        try {
            if (personaRepository.existsById(id)){
                personaRepository.deleteById(id);
                return true;
            }
            else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
