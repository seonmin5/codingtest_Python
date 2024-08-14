def solution(myString):
    splitString = myString.split('x')
    # 빈 문자열 = 거짓
    result = [s for s in splitString if s]
    result.sort()
    return result