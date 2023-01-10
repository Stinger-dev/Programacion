numA = int(input(" Enter one number: "))
numB = int(input(" Enter another number: "))
resultado = 0

if numA < numB:
    tmp=numA
    numA=numB
    numB = tmp

for n in range(abs(numA)):
    resultado = resultado + numB
    
if numA<0 and numB<0:
    resultado=-resultado
print(" The product is %s" % (resultado))

input("\n Push enter to exit")


    