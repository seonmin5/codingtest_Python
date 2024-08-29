def solution(arr, idx):
    # 찾을 문자, 시작지점, 종료지점
    try:
        return arr.index(1, idx)
    except ValueError:
        return -1