from erros import EntradaInvalidaError


def validar_nome_produto(nome_produto):
    nome_produto = nome_produto.strip()

    if nome_produto == "":
        raise EntradaInvalidaError("Digite um nome valido para o produto.")

    return nome_produto


def validar_preco_produto(preco_produto):
    preco_produto = preco_produto.strip().replace(",", ".")

    if preco_produto == "":
        raise EntradaInvalidaError("Digite um preco valido para o produto.")

    try:
        preco_convertido = float(preco_produto)
    except ValueError as exc:
        raise EntradaInvalidaError("O preco precisa ser um numero valido.") from exc

    if preco_convertido < 0:
        raise EntradaInvalidaError("O preco nao pode ser negativo.")

    return preco_convertido
