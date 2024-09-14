package com.horizon.demo.repository;

import com.horizon.demo.entities.Transferencia;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TransferenciaRepository extends JpaAttributeConverter<Transferencia, UUID> {
}
