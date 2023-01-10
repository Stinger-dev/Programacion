numero = int(input(" Enter one number between 0 and 10: "))

while numero < 0 or numero > 10:
    numero = int(input(" The number is out of the boundaries, please enter another one: "))
    
for n in range(11):
    print("%s*%s=%s" % (numero, n, numero * n))
    
input("\n Push enter to exit")
