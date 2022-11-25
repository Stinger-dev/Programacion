def lowCaseInString(cad):
    k = 0
    for n in cad:
        if n.islower():
            k += 1
    return k


print(lowCaseInString('sgsfdg'))
