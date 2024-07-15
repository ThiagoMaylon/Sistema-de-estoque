package com.mercado.Sistema_de_estoque.service.impl;


import com.mercado.Sistema_de_estoque.domain.model.Produto;
import com.mercado.Sistema_de_estoque.domain.repository.ProductRepository;
import com.mercado.Sistema_de_estoque.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {
    @Autowired
    ProductRepository repository;

    @Override
    public Produto getById(long id) throws ChangeSetPersister.NotFoundException {
        return repository.findById(id).orElseThrow(ChangeSetPersister.NotFoundException::new);
    }

    @Override
    public List<Produto> getAll() {
        return repository.findAll();
    }

    @Override
    public Produto create(Produto produto) {
        if(repository.existsById(produto.getId())){
            throw new IllegalArgumentException("produto já existe");
        }
        return repository.save(produto);
    }

    @Override
    public void deleteById(long id) {
        Produto produto = repository.getReferenceById(id);
        repository.delete(produto);
    }
}
