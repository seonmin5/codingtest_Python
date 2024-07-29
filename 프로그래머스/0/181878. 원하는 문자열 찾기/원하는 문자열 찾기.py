def solution(myString, pat):
    lowerString = myString.lower()
    lowerPat = pat.lower()
    if lowerPat in lowerString:
        return 1
    else:
        return 0
