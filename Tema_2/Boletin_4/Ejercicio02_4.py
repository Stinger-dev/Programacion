def weirdSum(a,i):
    tmp = [str(a)]
    for n in range(i-1):
        tmp.append(tmp[-1]+str(a))
    tmp = map(int,tmp)
    solucion = 0
    for n in tmp:
        solucion += n
        
    return solucion

print(weirdSum(2, 3) == 246)