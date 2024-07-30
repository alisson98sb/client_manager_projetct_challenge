package com.example.gerenciamento_de_clientes.repositories;

import com.example.gerenciamento_de_clientes.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
