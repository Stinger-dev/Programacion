tipo1 = input("Primer tipo: ").strip().upper()
rh1 = tipo1[-1]
tipo1 = tipo1 [:-1]
tipo2 = input("Segundo tipo: ").strip().upper()
rh2 = tipo2 [-1]
tipo2 = tipo2 [:-1]


A = [["A", "AB"],["A", "0"]]
B = [["B", "AB"],["B", "0"]] 
AB = [["AB"],["A", "B","AB", "0"]]
O = [["A", "B", "AB", "0"],["0"]]

donaTipo=False
recibeTipo=False


positivo = [["+"],["+", "-"]]
negativo = [["+", "-"],["-"]]

match tipo1:
    case "AB": 
        if tipo2 in AB[0]:
            donaTipo = True
        if tipo2 in AB[1]:
            recibeTipo= True
    case "A": 
        if tipo2 in A[0]:
            donaTipo = True
        if tipo2 in A[1]:
            recibeTipo= True
    case "B": 
        if tipo2 in B[0]:
            donaTipo = True
        if tipo2 in B[1]:
            recibeTipo= True
    case "0": 
        if tipo2 in O[0]:
            donaTipo = True
        if tipo2 in O[1]:
            recibeTipo= True

if donaTipo or recibeTipo: 
    donaTipo = False
    recibeTipo= False
           
    match rh1:
        case "+":
            if rh2 in positivo[0]:
                donaTipo = True
            if rh2 in positivo[1]:
                recibeTipo = True 
        case "-":
            if rh2 in negativo[0]:
                donaTipo = True
            if rh2 in negativo[1]:
                recibeTipo = True     
            
                   
if donaTipo:
    print( f"{tipo1}{rh1} dona a {tipo2}{rh2}")
if recibeTipo and recibeTipo:
    print( f"{tipo1}{rh1} recibe de {tipo2}{rh2}")
    
if not (donaTipo):
    print("No son compatibles")
    
    
                