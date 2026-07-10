enum Tri {
    A("A"), B("AB"), C("ABC");
 
    private String code;
 
    Tri(String code) {
        this.code = code;
    }
 
    public String code() {
        return code;
    }
}

public class _25_3_17 {
    
    public static void main(String[] args) {
        Tri t = Tri.values()[Tri.A.name().length()];
        System.out.print(t.code());
   
    }
    
}

/*
① Tri.A.name()          →  "A"   (상수 이름)
② "A".length()          →  1     (문자열 길이)
③ Tri.values()[1]       →  B     (인덱스 1번 상수)
④ Tri.B.code()          →  "AB"  (B의 code 값)
⑤ 출력                  →  AB

values()    모든 상수를 배열로 반환      [A, B, C]
name()      상수의 이름을 문자열로       "A"
ordinal()   상수의 순서(인덱스)         (여기선 미사용)
.length()   문자열 길이 (String 메서드) 1

name()=상수 이름 / 
values()=상수 배열 / 
code()=저장된 code 값

*/
