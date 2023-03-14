package com.matheus.cambioservice.repo;

import com.matheus.cambioservice.model.Cambio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CambioRepository extends JpaRepository<Cambio, Long> {

    Cambio findByFromAndTo(String from, String to);

    Cambio findByFrom(String from);
}
