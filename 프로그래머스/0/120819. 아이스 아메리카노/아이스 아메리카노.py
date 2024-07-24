def solution(money):
    americano = []
    americano.append(money//5500)
    americano.append(money%5500)
    return americano