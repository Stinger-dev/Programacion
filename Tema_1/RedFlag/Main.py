'''
Esto no es mas que una prueba para poder aprender un poco del manejo de archivos como solo lectura
Tambien practico el como hacer un programa stand alone

'''
import random   #con esto podemos usar la funcion para generar numeros aleatiorios
import os  #con esto nos podemos comunicar facilmente con el OS

if os.name == "posix":  #Con esto podemos limpiar la consola de comandos en caso que lo usemos como stand alone en cualquier OS o al menos los  principales
    limpiar = "clear"       
elif os.name == "ce" or os.name == "nt" or os.name == "dos":
    limpiar = "cls"



def juego(nJugadores):
    
    os.system (limpiar)
    
    if nJugadores>2: #Es que jugar una persona es imposible y, ademas, un poco triste
        
        archivoBueno = open("bueno.txt","r", encoding = 'utf-8') #Abrimos los ficheros que estan en el mismo directorio y lo abrimos como solo lectura
        archivoMalo = open("malo.txt","r", encoding = 'utf-8') #el utf-8 para poder usar la Ñ #tambien podria imprementar la opcion de añadir mas lineas con el programa 
        
        lineasBueno = archivoBueno.readlines()#Leemos todo el fichero para contar cuantas filas hay y luego volvemos al punto de partida con seek
        nLineasBueno = len(lineasBueno)-1 #si no hago esto me puede dar el error de salirse del tamaño del archivo
        
        lineasMalo = archivoMalo.readlines()#aqui se crea una lista en la que cada elemento es una linea del txt
        nLineasMalo = len(lineasMalo)-1
        
        archivoBueno.close()    
        
        for n in range(nJugadores-1): #El menos uno es pq uno de los jugadores es al que le hacen la pareja
            print(f"\n PLAYER {n+1}\n")
            print(" GREEN FLAGS: \n")
            for n in range(4):
                print(" - " + lineasBueno[random.randint(0,nLineasBueno)])#genera un numero aleatorio entre 0 y el maximo de lineas y pilla una posicion de la lista
                
            print("\n\n RED FLAGS: \n")
            
            
            for n in range(5):
                print(' - ' + lineasMalo[random.randint(0,nLineasMalo)])
            input("Press enter to continue")
            os.system (limpiar)
    
            
    else:
        
        print(" Not enought players, at least 3 players, 2 makers and 1 who choose the winnern\n")
    

def agnadir():
        
    eleccion = input(" Press G to add GreenFlags, press R to add RedFlags or press Q to quit").upper().strip()
    
    if eleccion == "G":
        archivo = open("bueno.txt","a", encoding = 'utf-8')
    elif eleccion == "R":
        archivo = open("malo.txt","a", encoding = 'utf-8')
    elif eleccion == "Q":
        print("") 
        
    tmp = '1'
    while tmp != '0':
        tmp = input(" Indique la frase que quiere añadir (ponga solo 0 para salir): ").strip()
        if tmp != '0': 
            archivo.write(tmp)
      
      
            
eleccion = input(" P to play and A to add: ").upper().strip()
if eleccion == 'A':
    agnadir()
else:
    nJugadores = int (input(" players: "))
    juego(nJugadores)
 
input("Press enter to exit")