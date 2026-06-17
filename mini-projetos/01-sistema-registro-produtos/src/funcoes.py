
from erros import EntradaInvalidaError
from validacao import validar_nome_produto, validar_preco_produto


def esperar_enter():
    input("\nPressione Enter para continuar...")


def menu():

    # usar f-string e print único
    print("SISTEMA DE REGISTRO DE PRODUTOS")
    print("1. Registrar produto")
    print("2. Listar produtos")
    print("3. Buscar produto por nome")
    print("4. Excluir produto")
    print("5. Sair", end="\n\n")
    

def receber_nome_produto():
    nome_produto = input("Digite o nome do produto que deseja buscar: ")
    return validar_nome_produto(nome_produto).lower()


def receber_nome_novo_produto():
    nome_produto = input("Digite o nome do produto: ")
    return validar_nome_produto(nome_produto)


def receber_preco_produto():
    preco_produto = input("Digite o preço do produto: ")
    return validar_preco_produto(preco_produto)


def receber_opcao_menu():
    opcao = input("Digite a opção desejada: ").strip()

    if opcao == "":
        raise EntradaInvalidaError("Digite uma opcao valida.")

    try:
        return int(opcao)
    except ValueError as exc:
        raise EntradaInvalidaError("A opcao precisa ser um numero inteiro.") from exc
