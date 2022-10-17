numero=[0,0,0,0]

media = 0
for n in range (len(numero)):
    numero[n] = int(input(" Indique numero %s: " %(n+1)))
    media = media + numero[n]
    
media = media/len(numero)
'''

La otra forma sera crear una comparacion de cada numero respecto a la media 
con unos cuantos de if 

'''
print(" La media es de %s" %media )

for n in range(len(numero)):
    if numero[n] > media:
        print(" El valor %s esta por encima de la media" % numero[n])
        
        
        
input("\n Pulse enter para salir")