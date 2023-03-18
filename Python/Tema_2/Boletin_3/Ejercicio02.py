def lowCaseInString(cad):
    k = 0
    for n in cad:
        if n in 'qwertyuiopasdfghjklñzxcvbnmáéíóúüç': #esto se podria hacer mas facil y mas elegante con un .islower()
            k += 1
    return k


print(lowCaseInString('sgsfdg'))
