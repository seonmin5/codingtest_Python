def solution(arr, flag):
    x = []
    for idx, f in enumerate(flag):
        if f:
            x.extend([arr[idx]] * 2 * arr[idx])
        else:
            del x[-arr[idx]:]
    return x