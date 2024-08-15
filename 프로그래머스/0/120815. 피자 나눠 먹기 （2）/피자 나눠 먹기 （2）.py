def solution(n):
    pizza = 1
    while(True):
        if (pizza*6) % n == 0:
            return pizza
        else:
            pizza += 1