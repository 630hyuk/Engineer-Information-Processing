#include <stdio.h>
 
struct Test {
    int i;
    const char *g;
};
 
int main() {
    struct Test test[] = {{1, "AB"}, {2, "DC"}, {3, "EB"}}; 
    struct Test *p = &test[1]; 
                //p->i  =  2 
                //p->g  =  "DC"

    printf("%s", p->g + (p->i - 1));
                        //p->i - 1  =  2 - 1  =  1
                //p->g + (p->i - 1)  =  "DC" + 1

                //"DC" + 1  =  "C"

    return 0;
}

/*
p = &test[1]
  → p->i = 2,  p->g = "DC"

p->i - 1 = 1

p->g + 1 = "DC"에서 한 글자 뒤 = "C" 시작 위치

printf("%s", ...) → 'C'부터 끝까지 → "C"
*/