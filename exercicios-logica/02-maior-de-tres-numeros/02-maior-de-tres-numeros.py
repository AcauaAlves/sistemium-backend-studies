def encontrar_maior(numero1, numero2, numero3):
    if numero1 >= numero2 and numero1 >= numero3:
        return numero1
    elif numero2 >= numero1 and numero2 >= numero3:
        return numero2
    else:
        return numero3


print("Maior de três números")

primeiro_numero = float(input("Digite o primeiro número: "))
segundo_numero = float(input("Digite o segundo número: "))
terceiro_numero = float(input("Digite o terceiro número: "))

maior_numero = encontrar_maior(
    primeiro_numero,
    segundo_numero,
    terceiro_numero
)

print(f"O maior número é: {maior_numero}")