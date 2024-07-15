package com.mercado.Sistema_de_estoque.service;

import com.mercado.Sistema_de_estoque.domain.model.Produto;
import org.springframework.data.crossstore.ChangeSetPersister;


import java.util.List;

public interface ProdutoService {
    Produto getById(long id) throws ChangeSetPersister.NotFoundException;
    List<Produto> getAll();
    Produto create(Produto produto);
    void deleteById(long id);
}
