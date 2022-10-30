tamagno = int(input('Cuantos numero: '))
fibonacci = [1,1]

while len(fibonacci)<tamagno:
    fibonacci.append(fibonacci[-1]+fibonacci[-2])
    

#Esta parte de aqui es innecesaria pero queria que saliera la flechita
cadena = ''
separador = ' -> '
for n in range(len(fibonacci)):
    cadena += str(fibonacci[n]) + separador
cadena = cadena[:(-len(separador))]
#Todo esto no es necesario

print(cadena)