package com.mayorista.logistica.service;

import com.mayorista.logistica.model.Despacho;
import com.mayorista.logistica.repository.DespachoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class DespachoService {

    @Autowired
    private DespachoRepository despachoRepository;

    public Despacho crearDespacho(Long idPedido) {
        Despacho despacho = new Despacho();
        despacho.setIdPedido(idPedido);
        despacho.setEstadoDespacho("Preparando el pedido");
        //simula que el pedido llegara en 2 das
        despacho.setFechaEntrega(LocalDateTime.now().plusDays(2));
        return despachoRepository.save(despacho);
    }
}