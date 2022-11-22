a,b = [2,6],[6,7]

def encajan(a,b):
    return (a[0] in b or a[1] in b)

print(encajan(a, b))