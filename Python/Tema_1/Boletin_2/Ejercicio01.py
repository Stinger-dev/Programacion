'''
a) salarioBruto*(1-0.22) == salarioNeto
    b) 0 < dia <=31
    c) (num2!=0 and num1!=0 num1%3 == 0 and num2%3 == 0)
    d) nota >=5
    e) ((nota1+notq2+nota3)/3)>=5
'''

print("a)")
salarioBruto = [1000]
salarioNeto = [10, 780, 1500]
k = 0
for n in salarioBruto:
    j = 0
    for n in salarioNeto: 
        print(" salarioBruto:", salarioBruto[k], "/ salarioNeto:", salarioNeto[j], bool ((salarioBruto[k] > 0 and salarioNeto[j] > 0)and(salarioBruto[k] * (1 - 0.22) == salarioNeto[j])))
        j = j + 1
k = k + 1

print("b)")
dia = [-4, 0, 20, 31, 32]
k = 0
for n in dia:
    print(" dia =", dia[k], ":", bool(0 < dia[k] <= 31))
    k = k + 1
    
print("c)")
num1 = [-3, 0, 3, 4]
num2 = [-3, 0, 3, 4]
k = 0
for n in num1:
    j = 0
    for n in num2:
        print("num1:", num1[k], "/ num2:", num2[j], bool(num2 != 0 and num1 != 0 and num1[k] % 3 == 0 and num2[j] % 3 == 0))
        j = j + 1   
    k = k + 1
    
print("d)")
nota = [2, 5, 10]
k = 0
for n in nota:
    print(" nota =", nota[k], ":", bool(nota[k] >= 5))
    k = k + 1

print("e)")
nota1 = [0, 3, 5, 10]
nota2 = [0, 3, 5, 10]
nota3 = [0, 3, 5, 10]
k = 0
for n in nota1:
    j = 0
    for n in nota2:
        i = 0
        for n in nota3:
            print(" num1 =", nota1[k], ":", "/ num2 =", nota2[j], ":", "/ num3 =", nota3[i], ":", bool(((nota1[k] + nota2[j] + nota3[i]) / 3) >= 5))
            i = i + 1
        j = j + 1   
    k = k + 1
    
input ("\n Pulsa para salir")    
