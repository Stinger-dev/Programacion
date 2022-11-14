a,b = [2,6],[6,7]

def encajan(a,b):
    if a[0] in b or a[1] in b:
        return True
    return False

print(encajan(a, b))