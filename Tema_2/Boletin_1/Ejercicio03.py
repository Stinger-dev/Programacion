dia = -1
mes = -1
agno = -1

meses = ['enero','febrero','marzo','abril','mayo', 'junio', 'julio', 'agosto', 'septiembre', 'octubre', 'noviembre','diciembre']

def listaDiasAgno(agno):
    
    dias = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]    
    if ( (agno % 4 == 0 and agno % 100 != 0) or (agno % 400 == 0) ):
        dias[1]=29
    return dias




agno = int(input(' Indique el año: '))
if agno >= 0:
    mes = int(input(' Indique el mes: '))
    while ( not(0 < mes <= 12) and (mes >= 0) ):
        mes = int(input(' Mes no valido, pruebe de nuevo: '))
    
    if mes > 0:
        dia = int(input(' Indique el dia: '))
        while ((dia > listaDiasAgno(agno)[mes+1]) or (dia  == 0)):
            dia = int(input(' Dia no valido, pruebe de nuevo: '))
            
if dia > 0: #Como he inicializado el valor del dia a -1, la unica manera que la fecha sea correcta es que el dia sea mayor que uno, asi que asi puedo asegurarme que la fecha es correcta para poner la forma larga
    print(f' La fecha en formato largo es {dia} de {meses[mes-1]} de {agno}')


input('\n Saliendo')











