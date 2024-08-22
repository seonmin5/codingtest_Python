def solution(n):
    if (n**0.5).is_integer():
        return (n**0.5+1)**2
    else:
        return -1