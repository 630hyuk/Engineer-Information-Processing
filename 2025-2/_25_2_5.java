public class _25_2_5 {
    public static void change(String[]  data, String s){
        data[0] = s;
        s = "Z";
    }
    
    public static void main(String[] args) {
        String data[] = { "A" };
        String s = "B";
        
        change(data, s);
        System.out.print(data[0] + s);
    }
    
}

/*

핵심 정리 
 메서드의 매개변수 s는 main의 s와 별개의 지역 변수입니다. 
 메서드 안에서 s에 새 값을 대입해도, main의 s에는 영향이 없습니다.

배열 원소 수정 = 원본 반영 / 매개변수 재대입 = 원본 무관

data[0] = s → 원본 배열 바뀜 → data[0] = "B"

s = "Z" → main의 s 그대로 → s = "B"

결과: "B" + "B" = "BB"

*/