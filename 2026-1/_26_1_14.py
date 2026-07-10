def f(a):
    m = [[x] for x in a]
    b = m[:]
    for i in range(len(b) - 1):
        b[i+1] += b[i]
    return sum(len(x) for x in m)
 
print(f([1, 2, 3, 4]))

"""
m = [[x] for x in a]   # a = [1,2,3,4]
m = [[1], [2], [3], [4]]

m[:]는 얕은 복사입니다. 바깥 리스트는 새로 만들어지지만, 
안의 내부 리스트들은 m과 같은 객체를 공유합니다.

b[0] ↔ m[0]  (같은 [1] 객체)
b[1] ↔ m[1]  (같은 [2] 객체)
...

m[1]=[2,1]
m[2]=[3,2,1]
m[3]=[4,3,2,1]

sum(len(x) for x in m)
-> 1 + 2 + 3 + 4 = 10

"""