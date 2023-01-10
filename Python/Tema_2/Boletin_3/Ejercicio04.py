def numberInString(cad, num):
    k = 0
    num = str(num)
    for n in cad:
        if n == num:
            k += 1
    return k


print(numberInString('12323125', 7))
print(numberInString('12323125', 5))
print(numberInString('12323125', 1))
print(numberInString('12323125', 2))
