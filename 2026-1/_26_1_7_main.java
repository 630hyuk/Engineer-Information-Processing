class A {
    String f(Object x) {
        return "1";
    }
    
    String g() {
        return f("a"); 
    }
}
 
class B extends A {
    String f(Object x) {
        return "2";
    }
    
    String f(String x) {
        return "3";
    }
}
 
public class _26_1_7_main {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.g());
    }
}

/*
핵심 정리
어떤 f를 부를지 = 컴파일 시점(A 기준) 
→ f(Object) / 그 f의 내용 = 실행 시점(B 기준) → "2"

함정 정리
"인수가 문자열 "a"니까 B의 f(String)가 불려서 3이 나오지 않을까?"

아닙니다. g()가 A 클래스에 정의되어 있어, A 기준으로는 f(String)이 안 보입니다.
- 시그니처 결정(오버로딩) = A 기준, 컴파일 시점 → f(Object)
- 실제 구현(오버라이딩) = B 기준, 실행 시점 → return "2"
→ 답은 2

오버로딩 (어떤 시그니처?)
컴파일 시점
참조 타입 A 가 아는 것
f(Object) 고정

버라이딩 (어떤 구현?)
실행 시점
실제 객체 B
B의 f(Object) 실행

*/