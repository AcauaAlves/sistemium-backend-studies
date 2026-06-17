# Sistema de Registro de Produtos

Mini-projeto de terminal referente ao Nivel 1 da trilha Back-End da Sistemium.

Status da entrega: concluida no repositório.

## Objetivo

Praticar fundamentos de programacao back-end com Python por meio de um sistema de terminal que registra produtos em memoria, valida entradas do usuario e trata erros basicos sem encerrar o programa de forma abrupta.

## Requisitos

- cadastro simples em memoria
- listagem de produtos cadastrados
- busca de produto por nome
- exclusao de produto por nome
- validacao de nome e preco
- tratamento de erro para entradas invalidas
- testes basicos dos componentes principais

## Funcionalidades

- adicionar produtos
- remover produtos
- listar produtos
- buscar produtos por nome
- validar entrada de dados
- tratar erros

## Estrutura

- `src/`: codigo-fonte do projeto
- `tests/`: testes basicos

## Como executar

Entre na pasta do projeto e rode:

```bash
cd mini-projetos/01-sistema-registro-produtos
python3 src/main.py
```

## Como testar

```bash
cd mini-projetos/01-sistema-registro-produtos
python3 -m unittest discover -s tests -p 'test_*.py'
```

## Aprendizados

- organizacao de codigo em arquivos separados
- validacao de entrada com funcoes dedicadas
- tratamento de erros com excecoes customizadas
- uso inicial de orientacao a objetos com uma classe `Produto`
- escrita de testes basicos para validar comportamento

## Evidencias da entrega

- execucao local validada com `python3 src/main.py`
- testes validados com `python3 -m unittest discover -s tests -p 'test_*.py'`
- documentacao do requisito consolidada em `NIVEL-1-REQUISITOS-E-CHECKLIST.md`

## Forma de postagem para avaliacao

Esta entrega deve ser apresentada em uma thread propria, dedicada apenas ao `01-sistema-registro-produtos`.

O objetivo e permitir avaliacao individual do mini-projeto, com comentarios especificos sobre o que ficou bom e o que precisa de revisao.
