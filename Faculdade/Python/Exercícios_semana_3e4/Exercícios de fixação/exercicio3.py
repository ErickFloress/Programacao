ano = int(input("Digite um ano: "))
bissexto = ano % 4

if bissexto == 0:
    print(f"{ano} é um ano bissexto.")
else:
    print(f"{ano} não é um ano bissexto.")
