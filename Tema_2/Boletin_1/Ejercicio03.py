dia = 15
mes = 3
agno = 2022



def listaDiasAgno(agno):
    
    dias = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]    
    if ( (agno % 4 == 0 and agno % 100 != 0) or (agno % 400 == 0) ):
        dias[1]=29
    return dias


while dia > 0 and mes > 0 and agno > 0:
    agno = int(input(' Año:')) #preguntar si quiere validemos las cosas como vamos a salir si no le dejamos poner numeros negativos
    validos = listaDiasAgno(agno)
    
    dia = int(input(' Dia:'))
    mes = int(input(' Mes:'))

