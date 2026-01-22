import sys, heapq
input = sys.stdin.readline
n = int(input())
lst = []

for _ in range(n):
    i = int(input())
    if i == 0:
        if lst:
            print(heapq.heappop(lst)[1])
        else:
            print(0)
    else:
        heapq.heappush(lst, (abs(i),i))