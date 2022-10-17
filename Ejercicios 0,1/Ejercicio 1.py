print(" Calcular el perimetro y area de un rectangulo")
base = float (input (" Base (cm): "))
altura = float (input (" Altura (cm): "))

if (base > 0 and altura > 0) :
    print (" El perimero mide", ((altura + base)*2), "cm y el area es de", (base * altura), "cm cuadrados")
else:  
    print( "\n Los valores no son validos")
    
input ("\n Pulsa para salir")