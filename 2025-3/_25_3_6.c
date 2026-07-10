#include <stdio.h>
 
int main(void) {
    char str[] = "REPUBLICOFKOREA";
    int a = 0;
 
    while (str[a] != '\0')
        ++a;
 
    putchar(str[a - 2]);
    return 0;
}

//인덱스 : 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 
//문자 :  R  E  P  U  B  L  I  C  O  F  K  O  R  E  A  \0

// 15-2 = 13 
// 13 = 인덱스 13에 해당하는 문자는 'E'입니다.