import sys
input = sys.stdin.readline

n = int(input())

def factorial(n):
    # 팩토리얼 조건: 1 이하는 return 1
    if n <= 1:
        return 1
    return n*factorial(n-1)

print(factorial(n))