def solution(arr):
    result = []
    for i in arr:
        for _ in range(i):
            result.append(i)
    return result