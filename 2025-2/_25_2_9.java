public class _25_2_9 {
    static interface F {
        int apply(int x) throws Exception;
    }
 
    public static int run(F f) {
        try {
            return f.apply(3);
        } catch (Exception e) {
            return 7;
        }
    }
 
    public static void main(String[] args) {
 
        F f = (x) -> {
            if (x > 2) {
                throw new Exception();
            }
            return x * 2;
        };
 
        System.out.print(run(f) + run((int n) -> n + 9));
    }
 /*
 전체 흐름 한눈에
① run(f):
   f.apply(3) → x=3 > 2 → 예외 발생 → catch → 7

② run((int n) -> n+9):
   apply(3) → n=3 → 3+9 = 12 → 정상 반환 → 12

③ 7 + 12 = 19

즉, ① run이 항상 3을 넣는다는 점
    ② 첫 람다는 예외를 던져 7이 된다는 점
 
 */
}
