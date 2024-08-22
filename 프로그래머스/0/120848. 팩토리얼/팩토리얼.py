def solution(n):
    i = 1
    factorial = 1
    
    while True:
        i += 1
        factorial *= i
        if factorial > n:
            return i-1
