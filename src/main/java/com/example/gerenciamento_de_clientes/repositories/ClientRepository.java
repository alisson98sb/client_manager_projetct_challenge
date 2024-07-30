package com.example.gerenciamento_de_clientes.repositories;

import com.example.gerenciamento_de_clientes.domain.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {
}
