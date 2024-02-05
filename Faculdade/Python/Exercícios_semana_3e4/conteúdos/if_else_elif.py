nome = input("Digite seu nome: ")
idade = int(input("Digite sua idade: "))

print("Escolha uma das opções abaixo")
print("1 - soma")
print("2 - subtração")
opcao = int(input("Digite a opção: "))

if opcao == 1:
    num1 = int(input("Digite o primeiro numero: "))
    num2 = int(input("Digite o segundo numero: "))
    final = num1 + num2
    print("O resultado é ", final)

elif opcao == 2:
    num1 = int(input("Digite o primeiro numero: "))
    num2 = int(input("Digite o segundo numero: "))
    final = num1 - num2
    print("O resultado é ", final)
else:
    print("Essa não é uma opção válida")
