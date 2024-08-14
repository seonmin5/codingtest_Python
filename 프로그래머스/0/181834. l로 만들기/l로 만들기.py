def solution(myString):
    result = ''
    for s in myString:
        if s < 'l':
            result += 'l'
        else:
            result += s
    return result
        