import funcoes

from produto import Produto


PRODUTOS = [
    Produto("Mimosa", 10.99),
    Produto("Narguet", 22.99)
]


def buscar_produtos():
    return PRODUTOS


def registrar_produto():
    print("Registrar produto")

    nome_produto = funcoes.receber_nome_novo_produto()
    preco_produto = funcoes.receber_preco_produto()
    produto = Produto(nome_produto, preco_produto)
    buscar_produtos().append(produto)
    print(f"Produto '{produto.get_nome()}' registrado com preco R${produto.get_preco():.2f}")


def listar_produto():
    print("Listar produtos")

    for produto in buscar_produtos():
        print(f"Produto: {produto.get_nome()}, Preco: R${produto.get_preco():.2f}")

    funcoes.esperar_enter()


def buscar_produto():
    print("Buscar produto por nome")
    nome_buscado = funcoes.receber_nome_produto()

    lista_produtos = buscar_produtos()
    produtos_encontrados = []

    for produto in lista_produtos:
        nome_produto = produto.get_nome().strip().lower()

        if nome_buscado in nome_produto:
            produtos_encontrados.append(produto)

    if len(produtos_encontrados) == 0:
        print(f"Produto '{nome_buscado}' nao encontrado.")
    else:
        nomes = ", ".join(produto.get_nome() for produto in produtos_encontrados)
        print(f"Produto(s) encontrado(s): {nomes}")
    funcoes.esperar_enter()


def excluir_produto():
    print("Excluir produto")
    nome_buscado = funcoes.receber_nome_produto()
    lista_produtos = buscar_produtos()
    produtos_encontrados = []

    for produto in lista_produtos:
        nome_produto = produto.get_nome().strip().lower()

        if nome_buscado in nome_produto:
            produtos_encontrados.append(produto)

    if len(produtos_encontrados) == 0:
        print(f"Produto '{nome_buscado}' nao encontrado.")
    else:
        for produto in produtos_encontrados:
            lista_produtos.remove(produto)
        nomes = ", ".join(produto.get_nome() for produto in produtos_encontrados)
        print(f"Produto(s) excluido(s): {nomes}")
    funcoes.esperar_enter()
