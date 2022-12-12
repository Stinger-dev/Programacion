gasolina_depo = 0
diesel_depo = 0

def menu():
    opcion = input(' Indique que quiere hacer: ')
    
    match opcion:
        case '1':
            tipo = input(' Diesel o Gasolina').upper()
            cant = int(input(' Diesel o Gasolina'))
            
            if tipo == 'GASOLINA':
                if gasolina_depo + cant < 5000:
                    gasolina_depo += cant
                else:
                    
           
                