def solution(a, b):
    result = 0
    if b >= a:
        for i in range(a, b+1):
            result += i
        return result
    else:
        for i in range(b, a+1):
            result += i
        return result