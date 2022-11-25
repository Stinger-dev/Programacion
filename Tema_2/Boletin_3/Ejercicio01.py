def charactersInString(cad, char):
    k = 0
    cad, char = cad.lower(), char.lower()
    for n in cad:
        if n == char:
            k += 1
    return k

    
print(charactersInString('hola', 'l'))
