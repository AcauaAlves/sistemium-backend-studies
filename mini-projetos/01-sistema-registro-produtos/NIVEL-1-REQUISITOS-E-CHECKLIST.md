# Nivel 1 - Requisitos, Checklist e Evidencias

Este documento consolida o que o Nivel 1 da trilha Back-End da Sistemium pede, com base nos documentos:

- `INS-002` - Padrao de instrucoes tecnicas e desafios
- `INS-003` - Engenharia, review e evidencia
- `INS-004` - Uso de IA, seguranca e limites
- `INS-006` - Trilhas tecnicas e progressao
- `INS-007` - Trilha Back-End Sistemium
- `MEM-01` - Visao, cultura e regras da Sistemium

Observacao:
- `INS-008` trata da trilha Front-End e nao muda os requisitos do Nivel 1 de Back-End.

## 1. O que o Nivel 1 da trilha Back-End pede

### Objetivo da etapa

Aprender a programar com base suficiente para entender codigo de servidor.

### O que estudar

- variaveis
- tipos de dados
- condicionais
- lacos
- funcoes
- estruturas de dados basicas
- listas, arrays, mapas e dicionarios
- tratamento de erros
- entrada e saida de dados
- organizacao de arquivos
- orientacao a objetos
- testes basicos

### O que precisa saber fazer

- resolver problemas simples com codigo
- criar funcoes
- usar estruturas de dados
- tratar erros
- escrever testes simples
- explicar o proprio codigo
- ler codigo gerado por IA e apontar problemas basicos

### Entrega obrigatoria

Mini-projeto de terminal na stack escolhida com:

- cadastro simples em memoria
- validacao de entrada
- tratamento de erro
- testes basicos
- README explicando como rodar

### Exemplos aceitos no documento

- gerenciador de tarefas
- controle de despesas
- agenda simples
- catalogo de produtos

### Status esperado

Aprendiz capaz de entender logica e revisar codigo simples.

## 2. O que os outros documentos acrescentam para o Nivel 1

### INS-003 - Engenharia, review e evidencia

Para a entrega ser considerada pronta, voce tambem precisa:

- trabalhar em branch propria
- fazer commits pequenos e compreensiveis
- manter o projeto rodando
- evitar alteracao fora do escopo
- revisar a propria entrega antes do PR
- documentar quando necessario
- abrir PR com:
  - o que foi feito
  - por que foi feito
  - como testar
  - evidencias
  - riscos ou observacoes

Evidencias esperadas para estudo e mini-projeto:

- repositorio organizado
- mini-projeto versionado
- README explicativo
- log de execucao, print ou video curto
- PR aberto
- explicacao tecnica do que foi aprendido
- thread propria para a avaliacao da entrega

### INS-004 - Uso de IA, seguranca e limites

Uso correto de IA no Nivel 1:

- pode usar para estudar conceitos
- pode usar para explicar codigo
- pode usar para revisar o proprio codigo
- nao pode commitar codigo sem entender
- nao pode aceitar resposta sem testar
- deve revisar manualmente
- deve conseguir explicar com as proprias palavras:
  - o que estudou
  - o que entendeu
  - onde travou
  - que exercicio ou projeto fez
  - o que ainda precisa revisar

### INS-006 - Progressao

O Nivel 1 e a etapa de fundamento tecnico com:

- exercicios
- mini-projetos
- entendimento de documentacao
- uso responsavel de IA

A progressao nao depende so de curso:

- pratica
- README
- evidencias
- PR
- capacidade de explicar

### MEM-01 - Cultura e regras

O que vale como postura correta:

- estudar com consistencia
- entregar evidencias
- documentar o que aprendeu
- aceitar revisao
- usar IA com responsabilidade
- entender o que esta entregando

## 3. Aplicacao pratica ao mini-projeto atual

Projeto analisado:

- `mini-projetos/01-sistema-registro-produtos`

### O que ja esta presente

- mini-projeto de terminal em Python
- cadastro simples em memoria
- listagem de produtos
- busca por nome
- exclusao por nome
- validacao de entrada para nome e preco
- tratamento de erro com excecoes customizadas
- organizacao basica por arquivos
- uso de funcoes
- uso de listas e dicionarios
- ponto de entrada com `main.py`
- pasta `tests/` criada

### O que esta presente como evidencia de aprendizagem

- uso de orientacao a objetos com a classe `Produto`
- validacao separada em `validacao.py`
- tratamento de erro com excecoes customizadas em `erros.py`
- organizacao do fluxo em modulos separados
- log de estudos com explicacao do que foi aprendido
- README com comandos de execucao e de teste
- um arquivo simples de testes basicos em `tests/test_basico.py`

### O que foi validado nesta revisao

- o README do mini-projeto esta preenchido com objetivo, requisitos, execucao, testes e aprendizados
- existe um arquivo simples de testes basicos para classe e validacao usando `unittest`
- a aplicacao sobe no terminal e permite encerrar normalmente pelo menu
- o comando `python3 -m unittest tests/test_basico.py` executa com sucesso
- o log de estudos de `2026-06-16.md` registra a entrega e os aprendizados do Nivel 1

## 4. Checklist objetivo do Nivel 1

### Entrega tecnica

- [x] O projeto e um programa de terminal
- [x] A stack principal escolhida e Python
- [x] Existe cadastro simples em memoria
- [x] Existe validacao de entrada
- [x] Existe tratamento de erro
- [x] Existem testes basicos implementados
- [x] O README do mini-projeto explica como rodar
- [x] O README do mini-projeto explica como testar
- [x] O README do mini-projeto foi preenchido com objetivo e requisitos reais

### Checklist de aprendizagem

- [x] Uso de variaveis
- [x] Uso de condicionais
- [x] Uso de lacos
- [x] Uso de funcoes
- [x] Uso de listas e dicionarios
- [x] Entrada e saida de dados
- [x] Tratamento de erros em nivel inicial
- [x] Organizacao basica de arquivos
- [x] Evidencia clara de orientacao a objetos
- [x] Evidencia clara de testes basicos escritos por voce

### Checklist de evidencia e review

- [x] Branch organizada para a entrega
- [x] Commits pequenos e compreensiveis
- [x] Entrega consolidada no repositório
- [x] Evidencia de execucao registrada no repositório
- [x] Log de estudos atualizado com o desenvolvimento do mini-projeto
- [x] Regra de avaliacao definida com thread propria para o mini-projeto

## 5. Conclusao da revisao

A entrega tecnica do Nivel 1 esta concluida no repositório e atende ao escopo obrigatorio definido em `INS-007`:

1. mini-projeto de terminal na stack escolhida;
2. cadastro simples em memoria;
3. validacao de entrada;
4. tratamento de erro;
5. testes basicos;
6. README explicando como rodar.

## 6. Modelo de postagem no Discord

Exemplo curto, adaptavel:

```md
Conclui a etapa atual do meu mini-projeto de terminal do Nivel 1 da trilha Back-End.

Thread dedicada:
- `01-sistema-registro-produtos`

Projeto:
- sistema de registro de produtos em Python

O que implementei:
- cadastro em memoria
- listagem
- busca por nome
- exclusao
- validacao de entrada
- tratamento de erros

O que aprendi:
- organizacao basica de arquivos em Python
- validacao de entrada
- tratamento de erros com `try`, `except` e `raise`
- diferenca entre fluxo principal, funcoes auxiliares e validacao
```

## 7. Criterio honesto de status atual

Status atual do projeto, com base no que foi analisado:

- voce ja saiu do Nivel 0 e concluiu a entrega tecnica do Nivel 1 dentro do repositório
- o mini-projeto atende ao escopo obrigatorio da trilha para esta etapa
- a documentacao, os testes e as evidencias desta etapa estao fechados
