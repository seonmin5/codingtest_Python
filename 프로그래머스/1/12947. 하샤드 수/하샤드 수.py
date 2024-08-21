def solution(x):
    num = (sum([int(i) for i in list(str(x))]))
    return (x % num == 0)