public class Main {
    public static void main(String args []){
        Circle circle = new Circle("red" , 3);
        System.out.println(circle.calculatePerimeter());
        circle.display();

        Triangle triangle = new Triangle("blue", 1, 3);
        System.out.println(triangle.calculatePerimeter());
        triangle.display();
    }
    
}
