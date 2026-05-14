package com.mayorista.logistica.model;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "Despachos")
@Data
public class Despacho{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDespacho;

    private Long idPedido;
    private String EstadoDespacho;
    private LocalDateTime fechaEntrega;
}
