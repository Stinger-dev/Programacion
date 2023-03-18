'''
2)
    a)(nota1 >=5 and nota2 >=5 and nota3 >= 5)
    b)(saldo => 1000 and descubierto <=5)
    c) asignaturasAprobadas > (0.3*asignaturasCurso)
    d) meses con 31: enero marzo mayo julio agosto octubre diciembre  
       meses con 30: abril junio septiembre noviembre
       mes con 28:   febrero    
       
       (1,3,5,7,8,10,12)
       (4,6,9,11)
       (2)
       (0<mes<=12)and ((((mes == 1 or mes == 3 or mes == 5 or mes == 7 or mes == 8 or mes == 10) and (0<dia<=31))) or ((mes == 4 or mes == 6 or mes == 9 or mes == 11) and (0<dia<=30)) or (mes==28 and (0<dia<=28)))

       



Forma ultra bonita de hacer el ejercicio d) pero esto no vale ;((

mes =  int(input(" Numero del mes:"))
dia= int(input(" Dia del mes:  "))
match mes:
    case 1|3|5|7|8|10|12:
        print("",bool(0 < dia <=31) )
    case 4|6|9|11:
        print("",bool(0 < dia <=30) )
    case 2:
        print("",bool(0 < dia <=28) )
    case _:
        print("",False)
'''

print("a)")
nota1 = [4, 5, 6]
nota2 = [4, 5, 6]
nota3 = [4, 5, 6]

k = 0
for n in nota1:
    j = 0
    for n in nota2:
        i = 0
        for n in nota3:
            print("Nota1:", nota1[k], "/ Nota 2:", nota2[j], "/ Nota3:", nota3[i], bool(nota1[k] >= 5 and nota2[j] >= 5 and nota3[i] >= 5))

            i = i + 1
        j = j + 1
    k = k + 1

print("b)")

saldo = [100, 1000, 2000]
descubierto = [2, 5, 6]

k = 0
for n in saldo:
    j = 0
    for n in descubierto:
        print("saldo:", saldo[k], "/ descubierto:", descubierto[j], bool(saldo[k] >= 1000 and descubierto[j] <= 5))
        j = j + 1
    k = k + 1

print("c)")

asignaturasAprobadas = [1, 3, 4]
asignaturasCurso = [5, 10, 12]

k = 0
for n in asignaturasAprobadas:
    j = 0
    for n in asignaturasCurso:
        print(" asignaturasAprobadas:", asignaturasAprobadas[k], "/ asignarutasCurso:", asignaturasCurso[j], bool (asignaturasAprobadas[k] >= (asignaturasCurso[j] * 0.3)))
        j = j + 1
    k = k + 1

print("d)")

mes = int (input(" Mes: "))
dia = int (input(" Dia: "))

print ("", bool((0 < mes <= 12)and((((mes == 1 or mes == 3 or mes == 5 or mes == 7 or mes == 8 or mes == 10) and (0 < dia <= 31))) or ((mes == 4 or mes == 6 or mes == 9 or mes == 11) and (0 < dia <= 30)) or (mes == 28 and (0 < dia <= 28)))))

input ("\n Pulsa para salir")
