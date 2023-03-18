estadoCivil = input(" Indique estado civil(c,d,v,s): ").upper()

edad = int(input(" Edad: "))
'''
He supuesto que cuando decia menor que 35 queria decrir estrictamente menor que 35
y al igual con los 50 años

'''

if (estadoCivil == "S" or estadoCivil == "D") and edad < 35:
    retencion = 12
elif (edad > 50):
    retencion = 8.5 
elif (estadoCivil == "C" or estadoCivil == "V") and edad < 35:
    retencion = 11.3
else:
    retencion = 10.5
    
print(" la retencion es de un", retencion, "%")
