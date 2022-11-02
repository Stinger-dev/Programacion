#Comprobamos cuantas palabras de cada longitud hay en el txt con palabras que me baje de internet

f = open('Palabras.txt', 'r',  encoding = 'utf-8')

test = f.readlines()
print(len(test))

validas = []

for n in range(len(test)):    
    test[n] = test[n].replace('\n','')
 
for n in range(1,32): #Lo hago hasta 32 pq ya comprobe cual es la palabra mas larga
    validas = []
    
    for i in range(len(test)):  
        if len(test[i]) == n:
            validas.append(test[i])
            
            
    print(f'Para {n} hay {len(validas)}')
    


input("salir")
