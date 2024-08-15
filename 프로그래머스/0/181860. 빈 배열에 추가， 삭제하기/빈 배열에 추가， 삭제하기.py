def solution(arr, flag):
    result = []
    
    for i in range(len(arr)):
        if flag[i]:
            result += [arr[i]]*2*arr[i]
        else:
            result = result[:-arr[i]]
    
    return result