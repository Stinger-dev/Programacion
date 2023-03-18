def palindrome(cad):
    k = 0
    encontrado = False
    cad = cad.lower().strip()
    while not(encontrado) and k < len(cad) // 2:
        if cad[k] != cad[-k-1]: #accedemos a las ultimas posiciones de la cadena pero hay que restarle una porque empieza a contar desde -1 y no desde 0
            encontrado = True
        k += 1
        
    return not(encontrado)


print(palindrome('sal'))
print(palindrome('tenet'))
print(palindrome('radar'))
print(palindrome('reconocer'))
print(palindrome('ligar es ser agil'))
