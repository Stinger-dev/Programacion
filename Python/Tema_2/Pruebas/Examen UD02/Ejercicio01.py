nss = '110130116424'
andalucia = ['04', '11', '14', '18', '21', '23', '29', '41']


def generar_digito_control(numero):
    numero = int(numero)
    solucion = str(numero % 97)
    if len(solucion) == 1:
        solucion = '0' + solucion
    return solucion 


def es_emitido_andalucia(numero):
    valido = True
    numero = str(numero)
    if 11 < len(numero) < 13:
        if numero[0:2] not in andalucia:
            valido = False
        if numero[-2:] != generar_digito_control(numero[:-2]):
            valido = False
    else:
        valido = False
        
    return valido

        
print(generar_digito_control('2101301164'))
print(es_emitido_andalucia('210130116458'))

print(generar_digito_control('1855156258'))
print(es_emitido_andalucia('185515625824'))

print(generar_digito_control('1125462365'))
print(es_emitido_andalucia('112546236577'))

print(generar_digito_control('2368547598'))
print(es_emitido_andalucia('236854759846'))

print(generar_digito_control('0468547598'))
print(es_emitido_andalucia('046854759859'))

print(generar_digito_control('0468547637'))
print(es_emitido_andalucia('046854763701'))
