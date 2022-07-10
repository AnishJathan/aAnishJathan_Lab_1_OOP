public class Main {
    public static void main(String args []){
        Circle circle = new Circle("red" , 3);
        System.out.println(circle.calculateArea());
        circle.display();

        Triangle triangle = new Triangle("blue", 1, 3);
        System.out.println(triangle.calculateArea());
        circle.display();
    }
    
}
