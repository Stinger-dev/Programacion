def lowCaseInString(cad):
    k = 0
    for n in cad:
        if n in 'QWERTYUIOPASDFGHJKLÑZXCVBNMÁÉÍÓÚÜÇ': #esto se podria haber hecho mas facil y mas elegante con un .isupper()
            k += 1
    return k


print(lowCaseInString('sgsSVSDFVfdg'))
