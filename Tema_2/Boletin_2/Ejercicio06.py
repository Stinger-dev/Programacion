# Creo que ya esta, pero no es 100% 


def getNumberOfDigitsDecimal(cad):
    cad = str(cad)
    k = 0
    decimal = False
    for n in range(len(cad)):
        if cad[n] in '1234567890':
            k += 1
        elif cad[n] == '.' and not decimal and (n != (len(cad) - 1)) and (n != 0):
            if (n == 1 and (cad [0] in '+-')):
                return None
            else:
                decimal = True
        elif (cad[n] == '+' or cad[n] == '-') and n == 0:
            pass
        else:
            return None
    return k


def getNumberOfDigitsBinary(cad):
    cad = str(cad)
    k = 0
    decimal = False
    for n in range(len(cad)):
        if cad[n] in '01':
            k += 1
        elif cad[n] == '.' and not decimal and (n != (len(cad) - 1)) and (n != 0):
            if (n == 1 and (cad [0] in '+-')):
                return None
            else:
                decimal = True
        elif (cad[n] == '+' or cad[n] == '-') and n == 0:
            pass
        else:
            return None
    return k


def getNumberOfDigitsOctal(cad):
    cad = str(cad)
    k = 0
    decimal = False
    for n in range(len(cad)):
        if cad[n] in '01234567':
            k += 1
        elif cad[n] == '.' and not decimal and (n != (len(cad) - 1)) and (n != 0):
            if (n == 1 and (cad [0] in '+-')):
                return None
            else:
                decimal = True
        elif (cad[n] == '+' or cad[n] == '-') and n == 0:
            pass
        else:
            return None
    return k


def getNumberOfDigitsHexa(cad):
    cad = str(cad).upper()
    k = 0
    decimal = False
    for n in range(len(cad)):
        if cad[n] in '01234567890ABCDEF':
            k += 1
        elif cad[n] == '.' and not decimal and (n != (len(cad) - 1)) and (n != 0):
            if (n == 1 and (cad [0] in '+-')):
                return None
            else:
                decimal = True
        elif (cad[n] == '+' or cad[n] == '-') and n == 0:
            pass
        else:
            return None
    return k  


print(getNumberOfDigitsDecimal('-10'))

print(getNumberOfDigitsBinary('0010'))

print(getNumberOfDigitsOctal('-100'))

print(getNumberOfDigitsHexa('10F'))
