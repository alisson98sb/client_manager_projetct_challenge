package com.example.gerenciamento_de_clientes.domain.address;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Address {
    @Id
    @GeneratedValue
    private UUID id;

    private String street;
    private String address_number;
    private String complement;
    private String city;
    private String state;
    private String zip_code;
}
