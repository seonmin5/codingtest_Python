def solution(arr, n):
    if len(arr) % 2 == 0:
        for i in range(1, len(arr)+1, 2):
            arr[i] = arr[i]+n
        return arr
    else:
        for i in range(0, len(arr)+1, 2):
            arr[i] = arr[i]+n
        return arr
