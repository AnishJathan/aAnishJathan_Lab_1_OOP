public class Main {
    public static void main(String args []){
        Circle circle = new Circle("red" , 3);
        System.out.println(circle.calculatePerimeter());
        circle.renderer.draw();

        Triangle triangle = new Triangle("blue", 1, 3);
        System.out.println(triangle.calculatePerimeter());
        triangle.renderer.draw();

        Rectangle rectangle = new Rectangle("blue", 1, 3);
        System.out.println(rectangle.calculatePerimeter());
        rectangle.renderer.draw();

        Square square = new Square("blue",5);
        System.out.println(square.calculateArea());

    }
    
}
