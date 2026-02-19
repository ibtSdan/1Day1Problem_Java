n, m = map(int, input().split())
lst = list(map(int, input().split()))
cnt = 0
s = 0
e = 0
total = 0

while True:
    if total>=m:
        if total==m:
            cnt += 1
        total -= lst[s]
        s += 1
    elif e==n:
        break
    else:
        total += lst[e]
        e += 1
    
print(cnt)