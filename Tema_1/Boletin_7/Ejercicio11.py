'''
la dimension de la matriz es 2n-1

creo un for que meta el numero en un numero de columnas de 2n-1

creo otro for que segun las iteraciones vaya restandole desde fuera hacia dentro y luego uno al reves que le sume 

'''

numero = int(input(" Dimension: "))
print(f"\n Número {numero}: ")
fila = [] 

'''
En vez de esto, se podria usar una concatenacion de cadenas que viene a ser lo mismo y en vez de sumar, crear una variable contador 
con la que ir sustituyendo los numeros en vez de restarle, no es muy distinto quitando eso

''' 

columnas = 2*numero-1 #El numero de columnas siempre es 2n-1 
orden = 0

for n in range(columnas):
    fila.append(numero+1)
    
for n in range ((columnas+1)//2):
    
    for j in range(n,len(fila)-n):
        
        #Al haberle añadido un +1 en el valor de las filas puedo empezar restando directamente sin expeccion a la primera fila
        fila [j] = fila [j]-1  
        #Aunque tambien se podria hacer simplemente cambiado el orden del print tambien se podria hacer, quiza lo hago algun dia
        
    print(*fila [:])
    
for n in range ((columnas)//2,0,-1):
    
    for j in range(n,len(fila)-n):
        
        fila [j] = fila [j]+1
        
    print(*fila [:])
    
    
input("\n Pulsa enter para salir")