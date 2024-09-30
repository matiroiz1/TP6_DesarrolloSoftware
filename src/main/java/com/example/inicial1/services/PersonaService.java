package com.example.inicial1.services;

import com.example.inicial1.entities.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {

    List<Persona> search (String filtro) throws Exception;

    //Con Pageable
    Page<Persona> search (String filtro, Pageable pageable) throws Exception;
}
