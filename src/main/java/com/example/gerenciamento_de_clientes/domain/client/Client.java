package com.example.gerenciamento_de_clientes.domain.client;

import com.example.gerenciamento_de_clientes.domain.address.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "client")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String cpf_cnpj;

    private String corporate_reason;

    private String representative;

    private Boolean status_is_active;

    @OneToOne
    @JoinColumn(name = "id") //Dúvida: Eu vou utilizar o proprio id da entidade address ou preciso criar o compo id_address para ser apenas chave estrangeira?
    private Address address;
}
