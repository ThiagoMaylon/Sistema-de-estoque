# Diagrama de Classe

```mermaid
classDiagram
    class Produto {
        +String id
        +String categoria
        +String nome
        +String quantidade
        +String preco
        +String vencimento
        +Fornecedor fornecedor
    }

    class Fornecedor {
        +String id
        +String nome
        +String telefone
    }

    Produto --> Fornecedor : fornecedor

