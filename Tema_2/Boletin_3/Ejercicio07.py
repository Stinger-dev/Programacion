def remplazarEnFrase(frase,buscar,sustituir):
    if buscar in frase:      
        frase = frase[:frase.index(buscar)] + sustituir + frase[frase.index(buscar) + len(buscar):]
    return frase

print(remplazarEnFrase('hola a todos', 'a', 'pan'))