def solution(n):
    watermelon = {1:"수", 2:"수박"}
    
    if n % 2 == 0:
        return n//2 * watermelon[2]
    else:
        return n//2 * watermelon[2] + watermelon[1]