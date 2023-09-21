package com.example.mundoliteral.infra.mappers;

import com.example.mundoliteral.domain.Editora;
import com.example.mundoliteral.infra.entities.EditoraEntity;
import jdk.dynalink.linker.LinkerServices;

import java.util.List;
import java.util.stream.Collectors;

public abstract class EditoraMapper {

    public static EditoraEntity paraEntity(Editora editora){
        return EditoraEntity.builder().
                id(editora.getId()).
                nome(editora.getNome()).
                endereco(editora.getEndereco()).
                numeroTelefone(editora.getNumeroTelefone()).
                cnpj(editora.getCnpj()).
                email(editora.getEmail()).
                build();
    }

    public static Editora paraDomain(EditoraEntity editoraEntity){
        return Editora.builder().
                id(editoraEntity.getId()).
                nome(editoraEntity.getNome()).
                endereco(editoraEntity.getEndereco()).
                numeroTelefone(editoraEntity.getNumeroTelefone()).
                cnpj(editoraEntity.getCnpj()).
                email(editoraEntity.getEmail()).
                build();
    }

    public static List<Editora> paraDomains(List<EditoraEntity> editoraEntities){
        return editoraEntities.stream().map(EditoraMapper::paraDomain).collect(Collectors.toList());
    }
}
