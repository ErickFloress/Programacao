grauA = float(input("Digite sua nota de GA: "))
grauB = float(input("Digite sua nota de GB: "))
media = grauA * 0.3 + grauB * 0.7

while media > 0 and media <= 10:
    if media >= 6:
        print("Você não vai precisar realizar a prova de Grau C")
        break
    else:
        print("Você precisa realizar a provra de Grau C")
        break
else:
    print("Erro!")
