# Código feito a mão (com auxilio da IA para tirar duvidas) para um sistema de registro de produtos utilizando a estrutura de controle match-case
from erros import EntradaInvalidaError
import funcoes
import operacoes_lista


def main():
    # Função while para repetir o sistema de produtos até o usuário escolher sair
    while True:
        funcoes.menu()

        try:
            opcao = funcoes.receber_opcao_menu()
        except EntradaInvalidaError as erro:
            print(erro)
            funcoes.esperar_enter()
            continue

        try:
            match opcao:
                case 1:
                    operacoes_lista.registrar_produto()
                case 2:
                    operacoes_lista.listar_produto()
                case 3:
                    operacoes_lista.buscar_produto()
                case 4:
                    operacoes_lista.excluir_produto()
                case 5:
                    print("Encerrando o sistema...")
                    break
                case _:
                    print("Digite uma opcao valida do menu.")
                    funcoes.esperar_enter()
        except EntradaInvalidaError as erro:
            print(erro)
            funcoes.esperar_enter()


if __name__ == "__main__":
    main()
