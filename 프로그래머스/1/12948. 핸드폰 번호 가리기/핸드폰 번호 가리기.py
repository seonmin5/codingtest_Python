def solution(phone_number):
    block = len(phone_number)-4
    return ('*'*block+phone_number[-4:])
    