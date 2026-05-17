package com.mayorista.logistica.controller;

import com.mayorista.logistica.model.Despacho;
import com.mayorista.logistica.service.DespachoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/logistica")
public class DespachoController {

    @Autowired
    private DespachoService despachoService;

    @PostMapping("/generar/{idPedido}")
    public Despacho generarDespacho(@PathVariable Long idPedido) {
        return despachoService.crearDespacho(idPedido);
    }
    @GetMapping("/{idDespacho}")
    public Despacho obtenerDespacho(@PathVariable Long idDespacho) {
        return despachoService.obtenerDespachoPorId(idDespacho);
    }
}