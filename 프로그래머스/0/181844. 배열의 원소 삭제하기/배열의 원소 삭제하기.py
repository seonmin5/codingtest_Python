def solution(arr, delete_list):    
    result = []
    for i in arr:
        if i not in delete_list:
            result.append(i)
    return result