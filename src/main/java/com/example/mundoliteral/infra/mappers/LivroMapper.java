package com.example.mundoliteral.infra.mappers;

import com.example.mundoliteral.domain.Livro;
import com.example.mundoliteral.infra.entities.LivroEntity;

import java.util.List;
import java.util.stream.Collectors;

public abstract class LivroMapper {
    public static LivroEntity paraEntity(Livro livro){
        return LivroEntity.builder().
                id(livro.getId()).
                nome(livro.getNome()).
                autor(livro.getAutor()).
                valor(livro.getValor()).
                editora(livro.getEditora()).
                build();
    }

    public static Livro paraDomain(LivroEntity livroEntity){
        return Livro.builder().
                id(livroEntity.getId()).
                nome(livroEntity.getNome()).
                autor(livroEntity.getAutor()).
                valor(livroEntity.getValor()).
                editora(livroEntity.getEditora()).
                build();
    }

    public static List<Livro> paraDomains(List<LivroEntity> livroEntities){
        return livroEntities.stream().map(LivroMapper::paraDomain).collect(Collectors.toList());
    }

    public static List<LivroEntity> paraEntitys(List<Livro> livroList){
        return livroList.stream().map(LivroMapper::paraEntity).collect(Collectors.toList());
    }
}
