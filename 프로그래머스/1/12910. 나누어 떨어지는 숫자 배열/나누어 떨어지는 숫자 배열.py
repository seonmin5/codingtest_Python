def solution(arr, divisor):
    result = []
    for i in arr:
        if i % divisor == 0:
            result.append(i)
        else:
            pass
    
    if len(result):
        result.sort()
        return result
    else:
        return [-1]