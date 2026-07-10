#include <stdio.h>
 
double arr1(int p[], int len) {
    double av = 0;
    int i;
    for (i = 0; i < len; i++) {
        av += (double) p[i];
    }
    return av / len;
}
 
double arr2(int * p, int len) {
    double av = 0;
    int i;
    for (i = 0; i < len; i++) {
        av += (double)( * (p + i));
    }
    return av / len;
}
 
int main() {
    int arr[10] = {
        80,
        20,
        50,
        55,
        45,
        95,
        55,
        10,
        40,
        80
    };
    int len = 10;
 
    printf("%.2f", arr1(arr, len) + arr2(arr, len));
 
    return 0;
}

/*
핵심 정리 
arr1 = arr2 = 평균(53.0) → 합 106.0 → %.2f로 106.00

p[i] = *(p+i)           배열 인덱스 = 포인터 산술 (같음)
int p[] = int *p함수     매개변수에서 동일 취급
평균                     530 / 10 = 53.0
%.2f                    소수점 둘째 자리 → 106.00

*/
