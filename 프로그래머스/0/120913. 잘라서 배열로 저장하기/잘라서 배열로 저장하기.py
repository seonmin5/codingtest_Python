import math

def solution(my_str, n):
    calRange = math.ceil(len(my_str)/n)
    result = []
    for i in range(calRange):
        result += [my_str[i*n:n+i*n]]
    return result