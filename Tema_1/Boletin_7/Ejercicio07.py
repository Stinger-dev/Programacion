'''
esto tmb se podria hacer facil con una cadena y haciendo algo tipo (no lo he ejecutado paro iria mas o menos asi):

    cadena = ""
    for i in range (numero):
        cadena = cadena + str(numero)
        print(cadena) 
'''

numero = int(input(" Numero: "))
tmp = []
for i in range (numero):
    tmp.append(numero)
    print(*tmp)     
    
input ("\n Pulsa para salir")    

'''
El poner el asterisco antes del tmp hace que la cadena se descomprima
que he entendido que es algo asi como quitar las cosas que tiene al rededor


por asi decirlo, el asterisco quita el formato a la cadena y la imprime sin corchetes ni comas

'''
