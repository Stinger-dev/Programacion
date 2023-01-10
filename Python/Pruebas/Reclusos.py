from random import randint
import time

inicio = time.time()

    
def recluso(n,lista):
    k = 0
    encontrado = False
    num = n
    while k<=50 and encontrado == False:
        if lista[num-1] == n:
            encontrado = True
        else:
            num = lista[num-1]
            k +=1
            
    return(encontrado)


    
    
def iteracion():
    lista = []
    while len(lista) !=100:
        n = randint(1, 100)
        if n not in lista:
            lista.append(n)
    j = 1
    liberados = True
    
    while liberados == True and j <=100:
        
        liberados = recluso(j, lista)
        j+=1
    return liberados
        

libre = 0
muertos = 0

for n in range(10000):
    if iteracion() == True:
        libre+=1
    else:
        muertos+=1

print(f'Muertos: {libre/10000}, Vivos: {muertos/10000}, Total de iteraciones: {muertos+libre}')

print(time.time()-inicio)

input ('Press enter')