day = 28
month = 11
year = 2022

def getDayOfWeek(year, month, day):
    days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
    a = ((14 - month) // 12)
    y = (year - a)
    m = month + 12 * a - 2
    d = int((day + y + y // 4 - y // 100 + y // 400 + (31 * m) // 12) % 7)
    
    return days[d]

print(getDayOfWeek(year, month, day))
