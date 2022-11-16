dia = 15
mes = 3
agno = 2022

meses = ['enero','febrero','marzo','abril','mayo', 'junio', 'julio', 'agosto', 'septiembre', 'octubre', 'noviembre','diciembre']

def listaDiasAgno(agno):
    
    dias = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]    
    if ( (agno % 4 == 0 and agno % 100 != 0) or (agno % 400 == 0) ):
        dias[1]=29
    return dias

while ( not(0 < mes <= 12) and (mes > 0) ):
    mes = input(' Mes no valido, pruebe de nuevo')

if mes > 0:
    while ( not(0 < mes <= 12) and (mes > 0) ):
        mes = input(' Año no valido, pruebe de nuevo')   
    
    else:
        while dia > listaDiasAgno(agno)[mes+1]:
            dia = input(' Dia no valido, pruebe de nuevo')
            