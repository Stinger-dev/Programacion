lista = [1, 2, 3, 4, 5]


def reverse(aList):
    tmp = []
    for n in range(len(aList)):
        tmp.append(aList[(-n - 1)])
    return tmp


print(lista)
print(reverse(lista))
