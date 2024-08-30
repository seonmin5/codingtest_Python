def solution(order):
    order_count = str(order).count('3') + str(order).count('6') + str(order).count('9')
    return order_count
