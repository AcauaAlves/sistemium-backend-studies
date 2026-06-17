# Questionario - Nivel 1 Back-End Sistemium

Instrucao:
- responda com suas palavras
- quando houver codigo, escreva o trecho completo
- nao use IA para responder sem antes tentar sozinho
- quando errar, registre a correcao no seu log de estudos

## Parte 1 - Fundamentos de programacao

1. O que e uma variavel em Python?
    Variáveis são valores de tipos diferentes que são usados para compor o codigo, como por exemplo: armazenar a idade do usuário assim que ele imputar, guardar nome de produto, etc.

2. Qual a diferenca entre `str`, `int`, `float` e `bool`?
    str: texto mutavel
    int: numero inteiro
    float: numero com virgula
    bool: true or false

3. O que acontece quando voce usa `input()` em Python?
    Você recebe o input do usuário, podendo interagir diretamente com a tela, armazenar dados do usuário em variaveis ou listas, entre outras coisas.
    Ex: nome = str(input("Digite seu nome: ")) ## str nesse caso seria desnecessário, mas coloquei para exemplificar

4. Por que o retorno de `input()` normalmente precisa ser tratado antes de virar numero?
    porque input sem definir tipo de variavel retorna string

5. Explique com suas palavras o que e uma condicional.
    Condicional no python (e em outras linguagens) de afunilar as opções do usuário, definir certos parametros, comparar valores entre outros. 
    Pode ser utilizado de diversas maneiras, como: o programa só vai rodar caso X >= Y, se não ele vai encerrar, ou qualquer outra ação que o dev definir.

6. Qual a diferenca entre `if`, `elif` e `else`?
    If: Se tal condicional estiver condizente com a variavel/função/ação, faça isso
    elif: Se não estiver correta a primeira condicional (neste caso 1o if), verificar se o variavel/função/ação se encaixa nesse segundo parametro e rodar o código.
    else: Se não se enquadra em nenhuma das condicionais anteriores, faça isso. 

7. O que e um laco de repeticao?
    Laço de repetição é fazer com que seu programa rode uma mesma função, sequencia de funções, ação, etc, sem que o usuário tenha que repetir a mesma ação varias vezes (isso se aplica em outros casos, mas foi a maneira mais simples que eu encontrei de responder)

8. Quando faz mais sentido usar `while`?
    While significa enquanto, então você pode definir por exemplo: 
        while X < Y:
            print("Abobora legal")
            X = x + 1
    resumindo: o codigo vai imprimir "abobora legal" enquanto X for menor que Y, e sempre ao final ele vai acrescentar +1 pro valor de X. Quando X for igual (ou maior, mas nesse caso não se aplica), o código vai rodar.

9. Quando faz mais sentido usar `for`?
    For significa "Para", então você também consegue fazer laços de repetição com essa estrutura.
    Exemplo: 
        for produtos in lista:
            print(f"Produto: {lista['nome']}")
    Enquanto existirem produtos na lista, ele vai printar o nome do produto (se definido corretamente na lista).

10. O que e uma funcao?
    Função é uma maneira de organizar o código, repetir conjunto de codigos (funções) especificos para manter o codigo mais limpo, e não precisar reescrever o mesmo codigo varias vezes conforme o escopo for aumentando.
    Exemplo: quero que seja feito um calculo com x variavel em mais de um momemnto no codigo.
    ao invés de:
        case 1:
            numero1 = float(input("Digite o primeiro número: "))
            numero2 = float(input("Digite o segundo número: "))
            resultado = numero1 + numero2
            print(f"Resultado: {resultado}")

        case 2:
            numero1 = float(input("Digite o primeiro número: "))
            numero2 = float(input("Digite o segundo número: "))
            resultado = numero1 + numero2
            print(f"Resultado: {resultado}")

    Posso criar uma função:

        def somar():
            numero1 = float(input("Digite o primeiro número: "))
            numero2 = float(input("Digite o segundo número: "))
            resultado = numero1 + numero2
            print(f"Resultado: {resultado}")
    
    E aí ficaria dessa maneira:
        case 1:
        somar()

        case 2:
        somar()
              
11. Por que dividir o codigo em funcoes ajuda na manutencao?
    O código fica mais legivel, facilitando a compreensão para você ou outra pessoa que vá mexer nele, auxiliando na hora de encontrar falhas lógicas e funcionais como um todo.

12. O que significa "chamar uma funcao"?
    Trazer uma função pré-estabelecida no sistema pra ser executada em algum ponto do sistema

13. O que significa "retornar um valor" com `return`?
    Devolver o valor praquela função.
    Exemplo: Quando ela for chamada, ela irá retornar o valor x como resposta do chamado da função

14. O que acontece quando uma funcao nao usa `return`?
    ela retorna nada, um valor nulo

15. O que e uma lista em Python?
    Lista é onde você consegue armazenar dados em ordem

16. O que e um dicionario em Python?
    Dicionário é onde você consegue armazenar informações através de chaves como nome e valor.
    Exemplo: 
    produto = {
        "nome": "Arroz",
        "preço": "R$:22,99",
    }

17. Qual a diferenca entre uma lista e um dicionario?
    A diferença é como os dados são armazenados.
    Lista: guarda vários itens em ordem. 
    Dicionário: guarda informações com nome e valor.

18. O que e um indice em uma lista?
    É a posição da de um item dentro da lista, que começa com 0
    exemplo: Arroz = 0
             Feijão = 1
     
19. O que e uma chave em um dicionario?
    Uma chave é o nome usado para acessar um valor dentro de um dicionário.
    Exemplo: "nome": "Arroz",
    a chave é o "nome".

20. Explique com suas palavras o que significa "resolver um problema simples com codigo".
    Significa resolver problemas do dia a dia (como uma lista de compras) através de codigo.
    
## Parte 2 - Leitura e escrita de codigo

21. O que este codigo faz?

```python
nome = input("Digite seu nome: ").strip()
print(nome)
```

22. O que `strip()` faz?
23. O que `lower()` faz?
24. O que `replace(",", ".")` faz em uma string de preco?
25. O que este codigo faz?

```python
preco = float("10.5")
```

26. O que acontece se voce tentar executar `float("abc")`?
27. O que significa `produtos.append(...)`?
28. O que significa `lista.remove(item)`?
29. O que este trecho faz?

```python
for produto in produtos:
    print(produto["nome"])
```

30. O que este trecho faz?

```python
if nome_buscado in nome_produto:
    produtos_encontrados.append(produto)
```

31. O que significa usar `in` numa comparacao com string?
32. Qual a diferenca entre `=` e `==`?
33. O que significa `!=`?
34. O que significa `>=`?
35. O que faz `len(produtos_encontrados)`?
36. O que este codigo imprime?

```python
nomes = ["Ana", "Bruno", "Carlos"]
print(", ".join(nomes))
```

37. Por que usar nomes de variavel claros ajuda no entendimento?
38. Qual e o problema de usar nomes vagos demais como `x`, `y` ou `coisa`?
39. O que e um comentario em Python?
40. Quando um comentario ajuda e quando ele so atrapalha?

## Parte 3 - Tratamento de erros

41. O que e um erro de execucao em Python?
42. O que `try` faz?
43. O que `except` faz?
44. O que `raise` faz?
45. O que e uma `Exception`?
46. O que significa criar um erro customizado?
47. O que esta acontecendo aqui?

```python
class ProdutoErro(Exception):
    pass
```

48. O que esta acontecendo aqui?

```python
class EntradaInvalidaError(ProdutoErro):
    pass
```

49. O que significa "herdar" de outra classe?
50. Por que faz sentido ter um erro chamado `EntradaInvalidaError`?
51. O que este codigo quer dizer?

```python
raise EntradaInvalidaError("Digite um nome valido para o produto.")
```

52. O que este bloco faz?

```python
try:
    opcao = int(input("Digite a opcao: "))
except ValueError:
    print("Opcao invalida")
```

53. Qual a vantagem de tratar erros em vez de deixar o programa quebrar?
54. Cite dois exemplos de entrada invalida no seu projeto.
55. Qual a diferenca entre erro de usuario e bug de programacao?

## Parte 4 - Estrutura do projeto

56. Qual e a funcao do `main.py` no seu projeto?
57. O que significa dizer que `main.py` e o ponto de entrada do sistema?
58. O que faz a funcao `main()`?
59. O que significa este trecho?

```python
if __name__ == "__main__":
    main()
```

60. Por que e melhor ter o fluxo principal dentro de `main()`?
61. Qual e a funcao de `funcoes.py` no seu projeto?
62. Qual e a funcao de `operacoes_lista.py` no seu projeto?
63. Qual e a funcao de `validacao.py` no seu projeto?
64. Qual e a funcao de `erros.py` no seu projeto?
65. Para que serve `__init__.py`?
66. O que significa "separar responsabilidades entre arquivos"?
67. Por que essa separacao ajuda na manutencao?
68. O que seria um sinal de que um unico arquivo esta fazendo coisa demais?
69. Em qual arquivo do seu projeto faz mais sentido ler `input()` do usuario?
70. Em qual arquivo do seu projeto faz mais sentido validar nome e preco?

## Parte 5 - Logica do mini-projeto

71. Onde os produtos estao sendo armazenados no seu projeto atual?
72. O que significa dizer que o cadastro atual e "em memoria"?
73. O que acontece com os produtos quando o programa fecha?
74. Explique o fluxo de `registrar_produto()` com suas palavras.
75. Explique o fluxo de `listar_produto()` com suas palavras.
76. Explique o fluxo de `buscar_produto()` com suas palavras.
77. Explique o fluxo de `excluir_produto()` com suas palavras.
78. O que este trecho faz?

```python
produtos_encontrados = []
```

79. Por que essa variavel precisa ser inicializada antes do `for`?
80. O que significa inicializar uma variavel?
81. O que acontece se voce usar uma variavel antes de inicializar?
82. Qual e a funcao de `buscar_produtos()` no projeto atual?
83. Por que o nome `nome_buscado` e melhor do que `produto_busca` ou `x`?
84. O que acontece se o usuario digitar um nome vazio na busca?
85. O que acontece se o usuario digitar um preco negativo no cadastro?

## Parte 6 - Git, evidencia e trilha

86. O que o Nivel 1 da trilha Back-End exige como entrega obrigatoria?
87. O que os documentos dizem sobre README no mini-projeto?
88. O que os documentos dizem sobre testes basicos no Nivel 1?
89. O que os documentos dizem sobre uso responsavel de IA?
90. O que os documentos dizem sobre evidencia de estudo?
91. O que os documentos dizem sobre PR?
92. O que os documentos dizem sobre explicar o que aprendeu no Discord?
93. Por que "funcionou aqui" nao e evidencia suficiente?
94. Que evidencias mostram que a entrega do Nivel 1 ficou pronta no repositório?
95. Por que abrir branch e PR faz parte da progressao, e nao so do Git?

## Parte 7 - Dissertativas de codigo

96. Escreva uma funcao simples chamada `mostrar_menu()` que imprima 3 opcoes de menu no terminal.
97. Escreva uma funcao chamada `validar_nome(nome)` que rejeite string vazia usando `raise`.
98. Escreva um bloco `try/except` que tente converter uma entrada para `float` e mostre uma mensagem amigavel se falhar.
99. Escreva um `for` que percorra uma lista de dicionarios de produtos e imprima nome e preco de cada item.
100. Escreva, com suas palavras, um resumo do que voce aprendeu neste mini-projeto sobre:
    - organizacao de arquivos
    - validacao
    - tratamento de erros
    - fluxo principal do programa
    - uso de IA com responsabilidade
