def solution(arr, flag):
    x = []
    for idx, f in enumerate(flag):
        if f:
            x += [arr[idx]] * 2 * arr[idx]
        else:
            x = x[:-arr[idx]]
    return x