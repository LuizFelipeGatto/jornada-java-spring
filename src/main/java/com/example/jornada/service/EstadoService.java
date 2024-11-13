package com.example.jornada.service;

import com.example.jornada.model.Estado;
import com.example.jornada.repository.EstadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EstadoService {

    private final EstadoRepository estadoRepository;

//    public EstadoService(EstadoRepository estadoRepository) {
//        this.estadoRepository = estadoRepository;
//    }

    public List<Estado> getEstados() {
        return estadoRepository.findAll();
    }

}
