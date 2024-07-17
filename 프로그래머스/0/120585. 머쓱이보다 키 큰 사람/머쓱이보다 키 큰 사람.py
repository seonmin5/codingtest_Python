def solution(array, height):
    array.append(height)
    array.sort()
    count = 0
    for i in array:
        if i > height:
            count += 1
    return count