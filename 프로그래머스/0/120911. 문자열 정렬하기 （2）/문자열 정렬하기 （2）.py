def solution(my_string):
    lowerString = sorted(s for s in my_string.lower())
    return (''.join(lowerString))