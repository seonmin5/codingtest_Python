def solution(array, height):
    count = 0
    for i in array:
        if i > height:
            count += 1
    return count