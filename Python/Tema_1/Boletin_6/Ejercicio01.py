for n in range(100):
    
    if n % 7 == 0 or n % 13 == 0:
        if n % 7 == 0:
            print(" The number %s is a multiple of 7" % (n))
        if n % 13 == 0:
            print(" The number %s is a multiple of 13" % (n))
    
    else:
        print(n)
        
input("\n Push enter to exit")
