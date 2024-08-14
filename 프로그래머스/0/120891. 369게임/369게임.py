def solution(order):
    count = 0
    for n in str(order):
        if n == "3" or n == "6" or n == "9":
            count += 1
    return count