'''
la dimension de la matriz es 2n-1

creo un for que meta el numero en un numero de columnas de 2n-1

creo otro for que segun las iteraciones vaya restandole desde fuera hacia dentro y luego uno al reves que le sume 

'''

numero = int(input(" Dimension: "))
print(f"\n Número {numero}:")
fila = []
columnas = 2*numero-1
orden = 0

for n in range(columnas):
    fila.append(numero+1)
    
for n in range ((columnas+1)//2):
    
    for j in range(n,len(fila)-n):
        
        fila [j] = fila [j]-1
        
    print(*fila [:])
    
for n in range ((columnas)//2,0,-1):
    
    for j in range(n,len(fila)-n):
        
        fila [j] = fila [j]+1
        
    print(*fila [:])
    
    
input("\n Pulsa enter para salir")