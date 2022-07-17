public class Rectangle implements Ishape{
    int length , width ;
    String color;

    
    public Rectangle (String color ,int length , int width){
        this.color = color;
        this.length =length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * (this.width+this.length);
    }
    @Override
    public double calculateArea(){
        return this.length*this.width;
    }
}

