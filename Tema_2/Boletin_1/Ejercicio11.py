a = ['a','b','c',2,4]

b = ['1', 'b',7,2]

def intersect(aList, bList):
    tmp = []
    for n in aList:
        if n in bList:
            tmp.append(n)
    for i in bList:
        if ((i in aList) and (i not in tmp)):
            tmp.append(i)
    
    return tmp

print(intersect(a, b))
    
