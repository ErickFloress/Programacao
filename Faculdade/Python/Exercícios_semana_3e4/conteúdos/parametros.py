def maiorOuMenor(a, b):
    if a > b:
        print("O valor de", a, "é maior que o de", b)
    elif a == b:
        print("O valor de", a, "é igual o valor de", b)
    elif a < b:
        print("O valor de", a, "é menor que o valor de", b)
    else:
        print("Erro!")


a = int(input("Digite um valor para a: "))
b = int(input("Digite um valor para b: "))
maiorOuMenor(a, b)

num1 = int(input("Digite um numero: "))
num2 = int(input("Digite outro numero: "))
qualquer = maiorOuMenor(num1, num2)
print(qualquer)