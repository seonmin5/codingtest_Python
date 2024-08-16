def solution(array):
    result = 0
    for s in array:
        result += (str(s).count('7'))
    return result