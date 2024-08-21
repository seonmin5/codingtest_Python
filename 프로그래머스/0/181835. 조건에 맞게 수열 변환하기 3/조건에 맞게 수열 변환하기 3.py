def solution(arr, k):
    return [ x+k if k%2 == 0 else x*k for x in arr]