'''
4)
    a) 300 >= cantidad >= 0
    b) not(22 >= edad >= 16)
    c) not(respuesta == "s" or respuesta == "n")
    d) not (numero%7 == 0  or numero%3 == 0)

'''

print("a)")
cantidad = [-10, 0, 100, 300, 400]
k = 0
for n in cantidad:
    print(" cantidad =", cantidad[k], bool(300 >= cantidad[k] >= 0))
    k = k + 1

print("b)")
edad = [15, 16, 18, 22, 30]
k = 0
for n in edad:
    print(" edad =", edad[k], not(22 >= edad[k] >= 16))
    k = k + 1
    
print("c)")
respuesta = ["n", "s" , "a" ]
k = 0
for n in respuesta:
    print(" respuesta =", respuesta[k], not(respuesta[k] == "s" or respuesta[k] == "n"))
    k = k + 1
 
print("d)")
numero = [2, 3, 5, 7, 21, 25, 42]
k = 0
for n in numero:
    print(" numero =", numero[k], not (numero[k] % 7 == 0  or numero[k] % 3 == 0))
    k = k + 1
    
input ("\n Pulsa para salir")
