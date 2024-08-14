def solution(n):
    result = [i for i in str(n)]
    result.sort()
    result.reverse()
    return int(''.join(result))