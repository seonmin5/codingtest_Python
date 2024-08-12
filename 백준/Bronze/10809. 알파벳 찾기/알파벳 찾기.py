import string
import sys
lowerList = list(string.ascii_lowercase)
input = sys.stdin.readline

word = input()
answer = []
for l in lowerList:
    if l not in word:
        answer.append("-1")
    else:
        answer.append(str(word.index(l)))
print(' '.join(answer))