#creo una lista con las opciones a las que gana
tijera = ['papel','lagarto']
papel = ['piedra','spock']
piedra = ['tijera','lagarto']
lagarto = ['papel','spock']
spock = ['tijera','piedra']

#Con este diccionario puedo unir cada palabra a la opccion sin tener que hacer if elif o else
#Ademas tambien puedo usarlo para validar los datos de entrada y es un 2x1
opciones = {'tijera':tijera,'papel':papel, 'piedra':piedra,'lagarto':lagarto,'spock':spock} 


#Comenzando con un valor '' puedo asegurarme que el codigo se ejecuta al menos una vez y hacer un pseudo-do...while
r1 = ''
r2 = ''

while not (r1=='spock'and r2=='spock'):
    
    r1 = input(' Eleccion 1: ').lower().strip()
    while not(r1 in opciones): #valido los datos buscando si hay una opcion en el dicccionario que tenga ese nombre
        r1 = input(' Eleccion 1 no valida, pruebe de nuevo: ').lower().strip()
        
    r2 = input(' Eleccion 2: ').lower().strip()
    while not(r2 in opciones):
        r2 = input(' Eleccion 2 no valida, pruebe de nuevo: ').lower().strip()
        
        
    if not (r1=='spock'and r2=='spock'): #Asi puedo salir directaamente del buvle sin hacer el codigo que sigue 
        if r1 == r2:
            print(f' {r1.capitalize()} y {r2} empatan') #con capitaliza() y el .lower() puedo imprimir los datos tal cual aparece 
        elif r1 in opciones[r2]: #si r1 esta en la lista de las opciones a la que gana r2, entonces r1 pierde contra r2
            print(f' {r1.capitalize()} pierde ante {r2}.')
        else :
            print(f' {r1.capitalize()} gana a {r2}.')
            
print(' El juego ha terminado')