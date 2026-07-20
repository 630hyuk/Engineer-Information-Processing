#include <stdio.h>
#define SIZE 3
 
typedef struct {
    int a[SIZE]; //크기 3 배열
    int front;  //꺼내는 위치
    int rear;    //넣는 위치
} Queue;
 
void enq(Queue* q, int val){
    q->a[q->rear] = val; 
    q->rear = (q->rear + 1) % SIZE; //원형 큐이므로 SIZE로 나눈 나머지로 위치를 계산
    
}
 
int deq(Queue* q) {
    int val = q->a[q->front];       //꺼내는 위치의 값
    q->front = (q->front + 1) % SIZE;   //front 위치를 다음으로 이동
    return val;
}
 
int main() {
    Queue q = {{0}, 0, 0};
 
    enq(&q,1); enq(&q,2); deq(&q); enq(&q, 3);
    
    int first = deq(&q);
    int second = deq(&q);
    printf("%d 그리고 %d", first, second);
    
    return 0;
}

/*
원형 큐 동작 추적

전체 흐름 한눈에
연산     a[0]     a[1]        a[2]        front       rear          비고
초기     0           0           0           0           0
enq(1)  1           0           0           0           1       rear = (0+1)%3 = 1
enq(2)  1           2           0           0           2       rear = (1+1)%3 = 2
deq()   1           2           0           1           2       front = (0+1)%3 = 1
enq(3)  1           2           3           1           0       rear = (2+1)%3 = 0
deq()   1           2           3           1           0       front = (1+1)%3 = 2
deq()   0                                               0       second = 3

그래서 답은 2 그리고 3

핵심 정리
enq(1), enq(2) → deq()로 1 버려짐 → enq(3) 
→ 남은 2, 3이 순서대로 나옴

*/