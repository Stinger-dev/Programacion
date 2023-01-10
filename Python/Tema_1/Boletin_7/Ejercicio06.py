agno = int(input(" Año al que calcular:"))
incremento = float(input(" Incrementar dinero en: "))
eurosInicial = float(input(" Primera paga: "))

totalDinero = 0
totalPuzzles = 0

k = 0
j = 0
for n in range (1, agno + 1):
    
    if n % 2 != 0:
        totalPuzzles = totalPuzzles + (2 ** k)
        k += 1
    else:
        totalDinero = totalDinero + (eurosInicial + incremento * j)
        j += 1
        
print(f" {agno} años => {totalPuzzles} puzzles y {totalDinero}€")

input("\n Presione enter para salir ")