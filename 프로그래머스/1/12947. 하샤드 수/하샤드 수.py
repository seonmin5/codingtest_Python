def solution(x):
    sumI = 0
    for i in str(x):
        sumI += int(i)
    if x % sumI == 0:
        return True
    else:
        return False