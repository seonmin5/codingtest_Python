def solution(n, k):
    if n < 10:
        return (n*12000) + (k*2000) 
    elif n >= 10 and k != 0:
        for i in range(1, (n//10)+1):
            k -= 1
    return (n*12000) + (k*2000)