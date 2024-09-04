import sys
input = sys.stdin.readline
n, m = map(int, input().strip().split())
trees = list(map(int, input().strip().split()))
start = 0
end = max(trees)
result = 0
while(start <= end):
	mid = (start + end) // 2
	total = sum(i-mid for i in trees if i > mid)
	if int(total) < m:
		end = mid -1
	else:
		result = mid
		start = mid +1
print(result)