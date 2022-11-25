def lowCaseInString(cad):
    k = 0
    for n in cad:
        if n.isupper():
            k += 1
    return k


print(lowCaseInString('sgsSVSDFVfdg'))
