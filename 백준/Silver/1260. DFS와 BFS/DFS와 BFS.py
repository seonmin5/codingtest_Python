import sys
from collections import deque
input = sys.stdin.readline

# 문제 조건 1. 정점 개수 n, 간선 개수 m, 시작 정점 번호 v
n, m, v = map(int, input().split())

# 문제 조건 2. 두 정점 사이에 여러 개의 간선, 양방향
graph = [[] for _ in range(n+1)]


# 문제 조건 3. m개의 줄에는 간선이 연결하는 두 정점 번호가 주어짐
for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

# 문제 조건 4. 방문할 수 있는 정점이 여러 개 -> 작은 것을 먼저 방문함
for i in range(1, n+1):
    graph[i].sort()

# DFS
# 1. 탐색 시작 노드를 스택에 삽입하고, 방문 처리한다.
# 2. 스택 최상단 노드에 방문하지 않은 인접한 노드가 하나라도 있으면 그 노드를 스택에 넣고 방문 처리한다.
# 3. 만약 방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼낸다.
# 4. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복한다.

def dfs(n):
    # 1번 수행: 탐색 시작 노드를 스택 삽입, 방문 처리 + 기록
    print(n, end=' ')
    visited[n] = True
    # 2번 수행: 인접 노드 체크
    for i in graph[n]:
        # 2번 수행: 인접 노드 방문 처리
        if not visited[i]:
            dfs(i)

# BFS
# 1. 탐색 시작 노드를 큐에 삽입하고, 방문 처리한다.
# 2. 큐에서 노드를 꺼낸 뒤에 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입하고 방문 처리한다.
# 3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복한다.

def bfs(n):
    # 1번 수행: 탐색 시작 노드를 큐 삽입, 방문 처리
    visited[n] = True
    queue = deque([n])
    # 3번 수행: queue에 방문할 노드가 없을 때까지 반복
    while queue:
        # 2번 수행: 큐에서 노드를 꺼낸 뒤 + 기록
        v = queue.popleft()
        print(v, end=' ')
        # 2번 수행: 인접 노드 체크
        for i in graph[v]:
            # 2번 수행: 인접 노드 방문 처리, 큐 삽입
            if not visited[i]:
                queue.append(i)
                visited[i] = True


# 방문 여부 리스트 초기화
visited = [False] * (n + 1)
dfs(v)
print()
visited = [False] * (n + 1)
bfs(v)