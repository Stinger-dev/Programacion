'''
Igual que una multiplicacion de x*y es sumarle a x y veces a si mismo, una resta es lo contrario y el resto es cuando ya ese numero no pueda restar
mas veces sin que de un numero  negativo

Empiezo el codigo haciendo una ordanacion (un poco mas complicada de lo nornal pq estaba aburrido) para asegurarme el n1>n2 y que no me de fallos 
a la hora de restar
'''


numero1 = float (input(" Numero 1:"))
numero2 = float (input(" Numero 2:"))

if numero2 > numero1:  # numero 1 sera el mas grande
    numero1 = numero2 * numero1
    numero2 = numero1 / numero2
    numero1 = numero1 / numero2
    
tmp = numero1
division = 0

while numero1 >= numero2:
    
    numero1 = numero1 - numero2
    division += 1

print(f" {tmp}/{numero2}={division} con resto {numero1}")

input ("\n Pulsa para salir")
