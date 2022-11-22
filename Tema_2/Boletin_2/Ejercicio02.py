def isLeapYear(agno):
    if ( (agno % 4 == 0 and agno % 100 != 0) or (agno % 400 == 0) ):
        return True
    return False