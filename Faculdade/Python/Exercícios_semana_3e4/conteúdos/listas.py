minhaLista = []
var = 1

while var == 1:
    produto = input("Produto para lista de compras: ")
    minhaLista.append(produto)
    print("\nVocê adicionou", produto, "na sua lista de compra")
    print("Você deseja adicionar algo mais? Digite 1 ")
    print("Caso não queira mais adicionar nada, digite 2.")
    var = int(input("Digite aqui: "))

print("Sua lista é: ", minhaLista)
