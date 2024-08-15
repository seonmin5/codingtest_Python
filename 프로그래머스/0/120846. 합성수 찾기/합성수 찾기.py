def solution(n):
    countList = []
    result = 0
    
    for i in range(4, n+1):
        count = 0
        for j in range(1, i+1):
            if i % j == 0:
                count += 1
        countList += [count]
    
    for n in countList:
        if n >= 3:
            result += 1
    
    return result