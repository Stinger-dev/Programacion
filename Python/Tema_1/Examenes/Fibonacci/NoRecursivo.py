import time

k=0
total = 0
tamagno = 995


for n in range(100000):
    
    inicio = time.time()
    #-------------------------------------------------------
    
    
    
    fibonacci = [1,1]    
    while len(fibonacci)<tamagno:
        fibonacci.append(fibonacci[-1]+fibonacci[-2])
        
    
    
    
    
    #-------------------------------------------------------
    
    fin = time.time()
    total += fin - inicio
    k += 1
 
    
    
print(total/k)