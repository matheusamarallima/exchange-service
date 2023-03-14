package com.matheus.cambioservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="cambio") // opcional se o nome já foi o mesmo
public class Cambio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="from_currency", nullable = false, length = 3)
    private String from;

    @Column(name="to_currency", nullable = false, length = 3)
    private String to;

    @Column(nullable = false)
    private BigDecimal conversionFactor;

    @Transient // esse cara não vai ser persistido na base
    private BigDecimal convertedValue;

    @Transient // esse cara não vai ser persistido na base
    private String environment;



}
