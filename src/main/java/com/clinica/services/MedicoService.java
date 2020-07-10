package com.clinica.services;

import com.clinica.dao.CRUD;
import com.clinica.models.Medico;
import com.clinica.repositories.MedicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService extends CRUD<Medico, MedicoRepository> {

    public MedicoService(MedicoRepository repostory) {
        super(repostory);
    }

    @Override
    public List<Medico> list() {
        return repository.findAll();
    }

    @Override
    public Medico get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Medico o) {
        repository.save(o);
    }

    @Override
    public void update(Medico o, int id) {
        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
