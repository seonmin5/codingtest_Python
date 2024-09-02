import sys
input = sys.stdin.readline

n, m = map(int, input().strip().split())
trees = list(map(int, input().strip().split()))

trees.sort()
start = 0
end = max(trees)
result = 0

while(start <= end):
	total = 0
	mid = (start + end) // 2
	for i in trees:
		if i > mid:
			total += i-mid
	
	if total < m:
		end = mid -1
	else:
		result = mid
		start = mid +1
print(result)