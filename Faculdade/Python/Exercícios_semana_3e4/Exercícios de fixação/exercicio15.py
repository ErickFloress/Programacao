quantidade = int(input("Quantos produtos você terá na lista?"))
lista = []
for i in range(0, quantidade):
    lista.append(input("Digite o produto:"))
print("Lista de compras:")
for i in lista:
    print(i)
