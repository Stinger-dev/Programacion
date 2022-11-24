'''

x = (-b+(((b**2)-(4*a*c))**(1/2)))/(2*a)
x = (-b-(((b**2)-(4*a*c))**(1/2)))/(2*a)        
'''


def numeroValido (cad):
    cad = str(cad)
    decimal = False
    for n in range(len(cad)):
        if cad[n].isnumeric():
            pass
        elif cad[n] == '.' and not decimal:
            decimal = True
        elif (cad[n] == '+' or cad[n] == '-') and n == 0:
            pass
        else:
            return None
    return int(cad)


def solveSecondOrderEquation(a, b, c):
    
    if numeroValido(a) != None and numeroValido(b) != None and numeroValido(c) != None and ((b ** 2) - (4 * a * c)) > 0:
        resultado = [((-b + (((b ** 2) - (4 * a * c)) ** (1 / 2))) / (2 * a)), ((-b - (((b ** 2) - (4 * a * c)) ** (1 / 2))) / (2 * a))]
    else:
        resultado = None
        
    return resultado

    
print(solveSecondOrderEquation(1, -5, 6) == [3, 2])
print(solveSecondOrderEquation(2, -7, 3) == [3, 1 / 2])
print(solveSecondOrderEquation(-1, 7, -10) == [2, 5])
