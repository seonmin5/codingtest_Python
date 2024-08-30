def solution(num, k):
    for idx, n in enumerate(str(num)):
        if n == str(k):
            return idx+1
    return -1