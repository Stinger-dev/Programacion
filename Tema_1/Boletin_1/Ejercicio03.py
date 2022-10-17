'''
3)
    a) 420 >= precio >= 60 
    b) numero%2 != 1
    c) (saldo > 0 and dineroSacar > 0) and saldo >= dineroSacar
    d) (60 >= minutos >=0)  and (23 >= hora >=0) 
    e) not(estadoCivil == "S" or estadoCivil == "C" or estadoCivil == "V" or estadoCivil == "D")
      
'''

print("a)")
precio= [500, 420, 200, 60, 10]
k=0
for n in precio:
    print(" precio =", precio[k],":"  ,(420 >= precio[k] >= 60))
    k = k+1
    

print("b)")
numero= [-2, -1, 0, 1, 2]
k=0
for n in numero:
    print(" precio =", numero[k],":" ,(numero[k]%2 != 1 ))
    k = k+1
    
    
print("c) ")
saldo=[-200,0,100]
dineroSacar=[-200,0,100,200]
k=0
for n in saldo:
    j=0
    for n in dineroSacar:
        print("Saldo:", saldo[k], "/ dineroSacar:", dineroSacar[j],bool((saldo[k]>0 and dineroSacar[j]>0) and saldo[k] >= dineroSacar[j]>0))
        j=j+1   
    k = k+1


print("d) ")
horas=[-1,0,2,23,24]
minutos=[-1,0,30,59,60]
k=0
for n in horas:
    j=0
    for n in minutos:
        print("Horas:", horas[k], "/ minutos:", minutos[j],bool(60 > minutos[j] >=0)  and (23 >= horas[k] >=0))
        j=j+1   
    k = k+1



print("e)")
estadoCivil=["S", "C", "D", "V", "G"]
k=0
for n in estadoCivil:
    print("Estado civil:", estadoCivil[k], bool (not(estadoCivil[k] == "S" or estadoCivil[k] == "C" or estadoCivil[k] == "V" or estadoCivil[k] == "D")))  
    k = k+1

input ("\n Pulsa para salir")