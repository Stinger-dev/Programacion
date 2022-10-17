iteraciones = int(input(" How many numbers do you want to input?"))

while iteraciones <0:
        iteraciones = int(input(" The number is not valid, it should be greater than 0: "))

for n in range(iteraciones):
    
    numero = int(input(" Enter one num    ber greater than 0: "))
    
    while numero<=0:
        numero = int(input(" The number is not valid, it should be greater than 0: "))
        
        
    if numero%2 ==0:
        print(" The number %s is even"%(numero))
    else:
        print(" The number %s is odd" %(numero))
        
        
input("\n Push enter to exit")