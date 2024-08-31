def solution(arr):
    x = []
    for i in arr:
        x += [i] * i
    return x