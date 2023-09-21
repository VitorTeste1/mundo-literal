package com.example.mundoliteral.infra.mappers;

import com.example.mundoliteral.domain.Cliente;
import com.example.mundoliteral.infra.entities.ClienteEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class ClienteMapper {

    public static ClienteEntity paraEntity(Cliente cliente){
        return ClienteEntity.builder().
                id(cliente.getId()).
                nome(cliente.getNome()).
                cpf(cliente.getCpf()).
                email(cliente.getEmail()).
                numeroTelefone(cliente.getNumeroTelefone()).
                endereco(cliente.getEndereco()).
                build();
    }

    public static Cliente paraDomain(ClienteEntity clienteEntity){
        return Cliente.builder().
                id(clienteEntity.getId()).
                nome(clienteEntity.getNome()).
                cpf(clienteEntity.getCpf()).
                email(clienteEntity.getEmail()).
                numeroTelefone(clienteEntity.getNumeroTelefone()).
                endereco(clienteEntity.getEndereco()).
                build();
    }

    public static List<Cliente> paraDomains(List<ClienteEntity> clienteEntities){
        return clienteEntities.stream().map(ClienteMapper::paraDomain).collect(Collectors.toList());
    }
}
