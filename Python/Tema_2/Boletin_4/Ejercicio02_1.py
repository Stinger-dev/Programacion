def sumDigits(num):
    num = str(num)
    tmp = []
    solucion = 0
    for n in num:
        tmp.append(int(n))
    for n in tmp:
        solucion += n
        
    return solucion 

print(sumDigits(6554) == 20)