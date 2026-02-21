import sys, heapq
input = sys.stdin.readline

n, m, k = map(int, input().split())
A = [[] for _ in range(n+1)]
for _ in range(m):
    u, v, w = map(int, input().split())
    A[u].append((v,w))
        
distance = [[] for _ in range(n+1)]
hq = []
heapq.heappush(hq, (0, 1))
heapq.heappush(distance[1], 0)

while hq:
    cost, node = heapq.heappop(hq)
    for next, weight in A[node]:
        new_cost = weight + cost
        if len(distance[next]) < k:
            heapq.heappush(hq, (new_cost, next))
            heapq.heappush(distance[next], -new_cost)
        elif -distance[next][0] > new_cost:
            heapq.heappop(distance[next])
            heapq.heappush(distance[next], -new_cost)
            heapq.heappush(hq, (new_cost, next))

for i in range(1,n+1):
    if len(distance[i]) < k:
        print(-1)
    else:
        print(-heapq.heappop(distance[i]))