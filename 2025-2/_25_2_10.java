public class _25_2_10 {

    public static class Parent {
 
        public int x(int i) { return i + 2; } //인스턴스 메서드
        public static String id() { return "P";} //정적 메서드 (stirng)
        
    }
 
    public static class Child extends Parent {
        
        public int x(int i) { return i + 3; } //parent x 오버라이딩
        public String x(String s) { return s + "R"; }
        public static String id() { return "C"; } //정적 메서드 (stirng)
        
    }
 
    public static void main(String[] args) {
 
        Parent ref = new Child();
        System.out.println(ref.x(2) + ref.id());
        
    }
    
}

/*
핵심 정리

인스턴스 메서드 = 실제 객체(Child)를 따라감
정적 메서드 = 참조 타입(Parent)을 따라감
-> 정적 메서는 객체가 아니라 클래스에 속해있기 때문에, 참조 타입을 기준으로 호출됨

ref.x(2): 인스턴스 메서드 → Child의 x → 2+3 = 5
ref.id(): 정적 메서드 → Parent의 id → "P"
결과: 5 + "P" = "5P"

*/