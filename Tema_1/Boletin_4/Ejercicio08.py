print(" Calcular dinero total a base del numero de cada tipo de moneda")

monedas2Euros = int(input(" Nº de monedas de 2 euros: "))
monedas1Euros = int(input(" Nº de monedas de 1 euro: "))
monedas050Euros = int(input(" Nº de monedas de 50 cent: "))
monedas020Euros = int(input(" Nº de monedas de 20 cent: "))
monedas010Euros = int(input(" Nº de monedas de 10 cent: "))


totalCentimos = (monedas010Euros*10)+(monedas020Euros*20)+(monedas050Euros*50)+(monedas1Euros*100)+(monedas2Euros*200)

print(" Tienes",(totalCentimos//100), "euros y", (totalCentimos%100), "centimos")

input ("\n Pulsa para salir")