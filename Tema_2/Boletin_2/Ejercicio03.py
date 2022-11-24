def isLeapYear(year):
    if ((year % 4 == 0 and year % 100 != 0) or (year % 400 == 0)):
        return True
    return False
    

def computeDaysInMonth(month, year):
    
    if 0 < month <= 12:
        if isLeapYear(year):
            days = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
            days = days[month - 1]    
        else:
            days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]  
            days = days[month - 1]   
    else:
        days = -1
    return days
