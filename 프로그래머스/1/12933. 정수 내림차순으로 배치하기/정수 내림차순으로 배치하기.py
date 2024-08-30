def solution(n):
    result = sorted([s for s in str(n)], reverse=True)
    return int(''.join(result))