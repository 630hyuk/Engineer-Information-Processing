i = input()
x = []
 
for word in i.split():
    x.append(word)
 
y = ''.join(x)
z = ''.join(c for c in y[::-1] if c not in 'ong')
 
print(z)

"""

입력값 : HumanDev

[::-1] -> 문자열 뒤집기
H u m a n D e v  →  v e D n a m u H

c not in 'ong' -> 소문자 n 하나만 제거됩니다.
v e D [n] a m u H  →  v e D a m u H

"""