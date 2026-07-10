class Rectangle {
    int width, height;
 
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
 
class Square extends Rectangle {
 
    Square(int a) {
        super(a, a);
    }
 
    int getSquareArea() {
        return width * height;
    }
}
 
public class _25_3_12 {
    public static void main(String[] args) {
        Square sq = new Square(10);
        System.out.println(sq.getSquareArea());
    }
}

/*
super   부모 클래스부모 생성자 호출 super(...)
this    자기 자신 클래스같은 클래스의 다른 생성자 호출 this(...)

부모(Rectangle)의 생성자를 호출해야 하므로 super 가 답입니다. 
this는 같은 클래스 내 생성자를 부를 때 써요.

*/