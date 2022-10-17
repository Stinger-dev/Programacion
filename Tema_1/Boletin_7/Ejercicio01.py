numero1 = float (input(" Numero 1:"))
numero2 = float (input(" Numero 2:"))


if numero2 > numero1:  #numero 1 sera el mas grande
    numero1 = numero2*numero1
    numero2 = numero1/numero2
    numero1 =  numero1/numero2
    
tmp=numero1
division=0

while numero1 >= numero2:
    
    numero1=numero1-numero2
    division+=1
    

print(f" {tmp}/{numero2}={division} con resto {numero1}")
