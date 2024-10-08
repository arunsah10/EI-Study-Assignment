public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle with red border");
        redCircle.draw();
    }
}
