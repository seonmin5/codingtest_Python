def solution(n):
    answer = []
    for i in range(2, n):
        if (n-1) % i == 0:
            answer.append(i)
    return min(answer)