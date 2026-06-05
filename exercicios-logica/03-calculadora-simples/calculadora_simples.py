def mostrar_menu():
    print("Calculadora legal")
    print("Digite o número da operação que deseja realizar:")
    print("1 - Soma")
    print("2 - Subtração")
    print("3 - Multiplicação")
    print("4 - Divisão")


def somar():
    resultado = 0
    contador = 1

    quantidade = int(input("Você escolheu soma. Digite quantos números deseja somar: "))

    while contador <= quantidade:
        numero = float(input(f"Digite o {contador}º número: "))
        resultado += numero
        contador += 1

    print(f"O resultado da soma é: {resultado}")


def subtrair():
    resultado = 0
    contador = 1

    quantidade = int(input("Você escolheu subtração. Digite a quantidade de subtrações: "))
    numero_inicial = float(input("Digite o número no qual você quer fazer as subtrações: "))

    while contador <= quantidade:
        numero = float(input(f"Digite o {contador}º número a subtrair: "))
        resultado += numero
        contador += 1

    resultado = numero_inicial - resultado

    print(f"O resultado da subtração de {contador - 1} números é: {resultado}")


def multiplicar():
    produto = 1
    contador = 1

    quantidade = int(input("Você escolheu multiplicação. Digite quantos números quer multiplicar: "))

    while contador <= quantidade:
        numero = float(input(f"Digite o {contador}º número: "))
        produto *= numero
        contador += 1

    print(f"O resultado da multiplicação de {contador - 1} números é: {produto}")


def dividir():
    numero = float(input("Você escolheu divisão. Digite o número que será dividido: "))
    divisor = float(input("Digite o divisor: "))

    if divisor == 0:
        print("Erro: não é possível dividir por zero.")
    else:
        resultado = numero / divisor
        print(f"O resultado da divisão é: {resultado}")


mostrar_menu()

operacao = int(input("Opção: "))

if operacao == 1:
    somar()

elif operacao == 2:
    subtrair()

elif operacao == 3:
    multiplicar()

elif operacao == 4:
    dividir()

else:
    print("Opção inválida. Tente novamente.")