import time

k=0 
total = 0
tamagno = 999


def fibonacci (k, tmp=[1,1]):
    if len(tmp) < k:
        tmp.append(tmp[-1]+tmp[-2])
        fibonacci(k, tmp)
    return tmp



for n in range(10000000):
    inicio = time.time()
    
    #-------------------------------------------------------
    
    fibonacci(tamagno)
    
    #-------------------------------------------------------

    fin = time.time()
    total += fin - inicio
    k+=1
    print(n)
    
   
print(total/k)