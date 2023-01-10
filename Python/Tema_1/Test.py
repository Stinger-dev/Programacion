import time
inicio = time.time()
f = open('Palabras.txt', 'r',  encoding = 'utf-8')

diccionario = f.readlines()

palabrasCinco = []
for n in range(len(diccionario)):    
    diccionario[n] = diccionario[n].replace('\n','')
    
    
for n in range(len(diccionario)): 
    
    if len(diccionario[n]) == 5:
        palabrasCinco.append(diccionario[n])
    
#en este punto hemos desartado todas las palabras que sean de otro tamaño que no sea 5, paso de 370105 palabras a 15920


noRepetidas=[]
for n in range(len(palabrasCinco)):
    i = 0
    repetida = False
    while i<5 and not (repetida): #Usando un algoritmo de busqueda es puedo aligerar el codigo en los casos en los que las repetidas salgan relativamente pronto, en el caso peor es igual que si usara un bucle for, seguro que hay formas de aligerar esto pero la verdad es que no se me ocurre
        if palabrasCinco[n].find(palabrasCinco[n][i], i+1) != -1:
            repetida = True  #la bandera de salida del bucle de busqueda es que exista una letra repetida en la palabra
        else:
            i += 1
            
    if repetida==False: #Si no se ha encontrado ninguna repetida entonces se añade esa palabra a la lista de palabras de 5 letras y 0 repetidas
        noRepetidas.append(palabrasCinco[n])
        
#en  este punto tengo ya solo las palabras de tamaño 5 y con letras que no se repiten, paso de 15920 a 10175, no es un paso tan grande, pero todo ayuda             
#creo que seria mas eficiente si en vez de crear una lista nueva simplemente borrase las lineas que no cumplen los requisitos

print(len(noRepetidas))

'''

A PARTIR DE AQUI TODO ESTA MAL ASI
Desde aqui deberia hacer el codigo que haga la comparacion de una manera relativamente rapida para encontrar las palabras
'''
def comun (a,b):
    for n in  a:
        for k in b:
            if n == k:
                return True
    return False

def distintos (a,opciones=[]):
    tmp = []
    for i in opciones:
        if not (comun(a, i)):
            tmp.append(i)
    return tmp  
    
for n in range(len(noRepetidas)):
    len(distintos(noRepetidas[n], noRepetidas[n:]))

print(time.time()-inicio)

input("Salir")