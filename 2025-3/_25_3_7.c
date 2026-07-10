#include <stdio.h>
 
struct Node {
    struct Node* next;
    unsigned int x;
};
 
int main() {
    struct Node t1 = { 0, 5u };
    struct Node t2 = { 0, 7u };
    struct Node t3 = { 0, 11u };
 
    t3.next = &t2;
    t2.next = &t1;
 
    struct Node* curr = &t3;
    int sum = 0;
 
    while (curr) {
        sum = sum * 3 + curr->x;
        curr = curr->next;
    }
 
    sum = (sum ^ 42u) + 100u;
 
    printf("%u\n", sum);
}

/* 

t3(x=11) → t2(x=7) → t1(x=5) → NULL

[1] 0 * 3 + 11 = sum : 11
[2] 11 * 3 + 7 = sum : 40
[3] 40 * 3 + 5 = sum : 125

125 ^ 42 = 87
-> ^은 XOR 연산자입니다. 125와 42를 이진수로 변환하여 각 비트 위치에서 XOR 연산을 수행합니다.
   125 = 0 1 1 1 1 1 0 1
    42 = 0 0 1 0 1 0 1 0
    ----------------
    87 = 0 1 0 1 0 1 1 1

87 + 100 = 187

%u는 부호 없는 정수(unsigned) 를 출력하는 형식 지정자입니다. 값이 양수 187이므로 그대로 출력됩니다.

XOR(^): 두 비트가 다르면 1, 같으면 0 — 자릿수 맞춰서 세로로 정렬하고 한 비트씩 비교
AND(&): 둘 다 1일 때만 1 (앞서 서브넷 마스크 계산에서 썼던 그 연산)
OR(|): 하나라도 1이면 1

*/