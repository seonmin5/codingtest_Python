def solution(arr, intervals):
    # 00 01 10 11
    first = arr[intervals[0][0]:intervals[0][1]+1]
    second = arr[intervals[1][0]:intervals[1][1]+1]
    return (first + second)