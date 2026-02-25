import sys
input = sys.stdin.readline

n = int(input())
lst = list(map(int, input().split()))
dic = {}
for i in lst:
    if i in dic:
        dic[i] += 1
    else:
        dic[i] = 1
        
m = int(input())
find_list = list(map(int,input().split()))
for find in find_list:
    if find in dic:
        print(dic[find], end=' ')
    else:
        print(0, end = ' ')