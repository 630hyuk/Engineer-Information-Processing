interface Machine {
    void run();
}
 
class WashingMachine implements Machine {  
    private String name;
 
    public WashingMachine() {
        this.name = "LG Washer";
    }
 
    public void run() {
        System.out.println("Washing machine running");
    }
}
 
public class _25_3_8 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
    }
}

/*
extends     : 클래스     : 다른 클래스를 상속받음
implements  : 인터페이스  : 인터페이스를 구현함

인터페이스를 사용(구현)하는 것이므로 implements 가 답입니다.
extends는 클래스 상속용이라 여기서는 틀립니다. 
대상이 인터페이스일 때는 무조건 implements

인터페이스는 "무엇을 해야 하는지"만 정의(메서드 껍데기) 하고, 
"어떻게 할지(실제 내용)"는 정의하지 않습니다.

인터페이스 사용 = implements / 클래스 상속 = extends
*/