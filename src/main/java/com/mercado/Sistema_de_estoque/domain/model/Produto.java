package com.mercado.Sistema_de_estoque.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity(name = "tb_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoria;
    private String nome;
    private Integer quantidade;

    @Column(scale = 2, precision = 13)
    private BigDecimal preco;

    private String dataVencimento;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Fornecedor> fornecedors;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public List<Fornecedor> getFornecedors() {
        return fornecedors;
    }

    public void setFornecedors(List<Fornecedor> fornecedors) {
        this.fornecedors = fornecedors;
    }
}
