package com.example.mundoliteral.infra.dataproviders;

import com.example.mundoliteral.domain.Cliente;
import com.example.mundoliteral.infra.entities.ClienteEntity;
import com.example.mundoliteral.infra.repository.ClienteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ClienteDataProvider {

    private final ClienteRepository repository;

    @Autowired
    public ClienteDataProvider(ClienteRepository repository) {
        this.repository = repository;
    }

    public ClienteEntity salvar(Cliente cliente){

    }
}
