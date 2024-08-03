def solution(n, k):
    # n인분이 10인분일 때마다 k-1
    return (n * 12000) + ((k - n // 10)*2000)