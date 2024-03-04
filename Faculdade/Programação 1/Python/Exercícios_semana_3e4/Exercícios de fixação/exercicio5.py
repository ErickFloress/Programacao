letra = input("Digite uma letra: ").lower()


if letra.isalpha():
    if letra in "aeiou":
        print(f"{letra} é uma vogal.")
    else:
        print(f"{letra} é uma consoante.")
else:
    print("Por favor, digite uma letra válida.")
