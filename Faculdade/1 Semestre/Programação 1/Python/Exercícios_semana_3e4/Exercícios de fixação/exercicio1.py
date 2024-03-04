num = int(input("Digite um valor inteiro: "))
parOuImpar = num % 2

if parOuImpar == 0:
    print("O número", num, "é par!")
elif parOuImpar == 1:
    print("O número", num, "é impar!")
else:
    print("Erro!")

