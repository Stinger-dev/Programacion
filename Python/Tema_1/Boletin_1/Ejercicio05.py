'''
5)
    a) (A OR B) AND NOT(A)
       A   B   S
       0   0   0
       0   1   1
       1   0   0
       1   1   0
       
    b) NOT (A OR B) AND B
       A   B   S
       0   0   0
       0   1   0
       1   0   0
       1   1   0
       
    c) A OR NOT (B)
       A   B   S
       0   0   1
       0   1   0
       1   0   1
       1   1   1
       
    d) NOT ((A AND B) AND (B OR A))
       A   B   S
       0   0   1
       0   1   1
       1   0   1
       1   1   0

'''
    
A = [0, 0, 1, 1]
B = [0, 1, 0, 1]

k = 0
print("S_a")
for n in A:
    print(bool((A[k] or B[k]) and not(A[k])))
    k = k + 1
    
k = 0
print("\nS_b")
for n in A:
    print(bool(not(A[k] or B[k]) and B[k]))
    k = k + 1
    
k = 0
print("\nS_c")
for n in A:
    print(bool(A[k] or not (B[k])))
    k = k + 1
 
k = 0
print("\nS_d")
for n in A:
    print(bool(not ((A[k] and B[k]) and (B[k] or A[k]))))
    k = k + 1    

input ("\n Pulsa para salir")    
