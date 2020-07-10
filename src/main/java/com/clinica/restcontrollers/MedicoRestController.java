package com.clinica.restcontrollers;

import com.clinica.models.Medico;
import com.clinica.services.MedicoService;
import com.clinica.util.Routes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Routes.MEDICO)
public class MedicoRestController {

    @Autowired
    MedicoService service;

    @GetMapping(Routes.LIST)
    public List<Medico> list(){
        return service.list();
    }

    @GetMapping(Routes.FIND)
    public Medico findById(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(Routes.CREATE)
    public void add(@RequestBody Medico medico){
        service.add(medico);
    }

    @PutMapping(Routes.EDIT)
    public void update(@RequestBody Medico medico, @PathVariable int id){

        service.update(medico, id);
    }

    @DeleteMapping(Routes.REMOVE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

}
