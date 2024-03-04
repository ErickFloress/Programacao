a = int(input("Digite o valor de a: "))
b = int(input("Digite o valor de b: "))
c = int(input("Digite o valor de c: "))

x1 = ((b * -1) + (b**2 - 4 * a * c) ** (1 / 2)) / (2 * a)
x2 = ((b * -1) - (b**2 - 4 * a * c) ** (1 / 2)) / (2 * a)

print("Resultados")
print("x' =", x1)
print("x'' =", x2)
