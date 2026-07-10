#include <stdio.h>
struct fns {
    int* (*fn)(int*);
} mine;
 
int* dummy(int *d) {
    return d + 1;
}
 
int main() {
    struct fns mine;
    int n[] = {16, 32};
    mine.fn = dummy;
    printf("%x", *mine.fn(n));
    return 0;
}

/*
전체 흐름 
mine.fn(n)      →  dummy(n)   →  &n[1]  (주소)
*mine.fn(n)     →  *(&n[1])   →  32     (값)
printf("%x",…)  →  32→16진수  →  20


32를 16진수로 변환 시
32 ÷ 16 = 몫 2, 나머지 0 → 16진수 "20"

*/