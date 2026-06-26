# Sistema de Registro de Produtos em Java

Mini-projeto de terminal referente ao `Nível 1` da trilha Back-End da Sistemium.

## Objetivo

Praticar fundamentos de Java em um projeto pequeno e explicável, usando:

- `Scanner`;
- `ArrayList`;
- classes e objetos;
- validação simples;
- tratamento de erro básico;
- organização em mais de um arquivo.

## Requisitos atendidos

- cadastro simples em memória;
- listagem de produtos;
- busca por nome;
- remoção por nome;
- validação de nome e preço;
- tratamento de erro para entrada inválida;
- teste básico executável sem dependência externa.

## Estrutura

- `src/Main.java`: fluxo principal e menu.
- `src/CadastroProdutos.java`: lista em memória e operações do sistema.
- `src/Produto.java`: classe do produto.
- `src/ValidadorProduto.java`: validações de nome e preço.
- `src/TestesBasicos.java`: verificações simples do projeto.
- `docs/ROTEIRO-DE-TESTE-MANUAL.md`: roteiro manual de validação.
- `docs/NIVEL-1-REQUISITOS-E-CHECKLIST.md`: checklist da entrega com base nos PDFs.

## Como compilar

```bash
cd java/mini-projetos/01-sistema-registro-produtos-java/src
javac Main.java CadastroProdutos.java Produto.java ValidadorProduto.java TestesBasicos.java
```

## Como executar

```bash
cd java/mini-projetos/01-sistema-registro-produtos-java/src
java Main
```

## Como testar

```bash
cd java/mini-projetos/01-sistema-registro-produtos-java/src
javac Main.java CadastroProdutos.java Produto.java ValidadorProduto.java TestesBasicos.java
java TestesBasicos
```

## Evidências da entrega

- projeto de terminal funcional;
- validação manual descrita em `docs/ROTEIRO-DE-TESTE-MANUAL.md`;
- testes básicos executáveis em `src/TestesBasicos.java`;
- log de estudos atualizado em `java/log-de-estudos/2026-06-26.md`.

## Observação de escopo

Este projeto foi mantido propositalmente simples para refletir uma etapa inicial de estudo em Java, sem framework, sem banco e sem recursos fora do que o `Nível 1` pede.
