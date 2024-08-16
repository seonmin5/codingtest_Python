def solution(order):
    result = 0
    for i in order:
        if i == "anything":
            result += 4500
        elif 'americano' in i:
            result += 4500
        elif 'cafelatte' in i:
            result += 5000
    return result