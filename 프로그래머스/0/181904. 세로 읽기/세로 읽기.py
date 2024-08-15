def solution(my_string, m, c):
    result = ''
    for s in range(c-1, len(my_string), m):
        result += my_string[s]
    return result