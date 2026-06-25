#Exercicio simples para verificar se um número é par ou impar, utilizando a função is_even para retornar um valor booleano.


def main():
    x = int(input("Verificar se o número é par ou impar, digite o número: "))
    if is_even(x):
        print("Par")
    else:
        print("Impar")


def is_even(n):
        return True if n % 2 == 0 else False

main()