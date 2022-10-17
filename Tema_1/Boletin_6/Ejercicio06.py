numA = int(input(" Enter one number: "))
numB = int(input(" Enter another number: "))
resultado = 0
for n in range(numA):
    resultado = resultado + numB
    
print(" The product is %s"  %(resultado))

input("\n Push enter to exit")