edad = int(input(" Indique la edad: "))

if 30<= edad <= 100:
    print(" La persona es adulta")
elif 18 <= edad <= 29:
    print(" La persona es joven")
elif 13 <= edad <= 17:
    print(" La persona es adolescente")
elif 0 <= edad <= 12:
    print(" Es un niño")
else: 
    print(" Edad no valida")