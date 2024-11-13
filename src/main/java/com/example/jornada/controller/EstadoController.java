package com.example.jornada.controller;

import com.example.jornada.model.Estado;
import com.example.jornada.service.EstadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estado")
@RequiredArgsConstructor
public class EstadoController {

    private final EstadoService estadoService;

    @GetMapping()
    public ResponseEntity<List<Estado>> getEstados(){
        return ResponseEntity.ok(estadoService.getEstados());
    }

}
