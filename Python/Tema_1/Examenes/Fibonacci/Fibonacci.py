tamagno = int(input('Cuantos numero: '))
fibonacci = [1,1]

while len(fibonacci)<tamagno:
    #Como es la suma de los dos ultimos numeros, simplemente accedo a las dos ultimas posiciones de la lista mediante los indices negativos
    fibonacci.append(fibonacci[-1]+fibonacci[-2])
    

#Esta parte de aqui es innecesaria pero queria que saliera la flechita
cadena = '' #si no la inicializo no puedo sumarla a si misma, obviamente
separador = ' -> '#esto es simplemente para que puedo hacer crtl+c y ctrl+v para usarlos en otros codigos, podria poner directamente el valor 
for n in range(len(fibonacci)):
    cadena += str(fibonacci[n]) + separador
cadena = cadena[:(-len(separador))]
#Todo esto no es necesario

print(cadena)