import java.util.*;


class Main {
    public static void main(String[] args) {
        Square square = new Square(Integer.parseInt(args[0]));
        Circle circle = new Circle(Integer.parseInt(args[0]));
        System.out.println(square.area());
        System.out.println(String.format("%.3f", circle.area()));
    }
}
