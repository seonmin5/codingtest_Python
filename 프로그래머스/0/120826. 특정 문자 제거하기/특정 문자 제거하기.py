def solution(my_string, letter):
    result = ''
    for i in my_string:
        if i not in letter:
            result += i
    return result