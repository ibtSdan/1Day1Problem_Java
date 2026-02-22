import sys
input = sys.stdin.readline

color = int(input())
color_list = list(map(int, input().split()))
k = int(input())
    
total = sum(color_list)
D = [[0 for _ in range(total+1)] for _ in range(total+1)]
for i in range(total+1):
    D[i][0] = 1
    D[i][1] = i
    D[i][i] = 1
        
for i in range(1, total+1):
    for j in range(1, i):
        D[i][j] = D[i-1][j] + D[i-1][j-1]

ssum = 0
for i in color_list:
    ssum += D[i][k]
    
print(ssum/D[total][k])