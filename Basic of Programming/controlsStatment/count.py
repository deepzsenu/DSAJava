def counter():
    n = 64
    s =1
    for i in range(1, n+1):
        s+=s*2
    print(s)
counter()