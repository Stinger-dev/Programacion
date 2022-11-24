def computeFactorial(num):
    if num >= 0:
        fact = 1
        for n in range(1, num + 1):
            fact *= n
    else:
        fact = None
    return fact


print(computeFactorial(10))
