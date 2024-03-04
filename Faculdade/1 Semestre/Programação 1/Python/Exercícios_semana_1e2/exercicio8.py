# notas grauA
atvPratica = float(input("Digite a nota de sua atividade prática: "))
atvTeorica = float(input("Digite a nota de sua atividade teorica: "))

# notas grauB
provaLab = float(input("Digite o valor de sua prova em laboratório: "))
testTeorico = float(input("Digite o valor de seu teste teórico: "))
trabExtraclasse = float(input("Digite o valor de seu trabalho extraclasse: "))

# Calculos
grauA = atvPratica*0.45 + atvTeorica*0.55
grauB = provaLab*0.6 + testTeorico*0.2 + trabExtraclasse*0.2
notaFinal = grauA*0.33 + grauB*0.67

print("Sua nota final é:",notaFinal)