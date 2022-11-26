def vocalesDistintas(cad):
    tmp = []
    cad = cad.lower()
    for n in cad:
        if n in 'aeiou':
            if n not in tmp:
                tmp.append(n)
    return len(tmp)


print(vocalesDistintas('abaco'))