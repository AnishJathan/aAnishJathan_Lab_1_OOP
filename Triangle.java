public class Triangle implements Ishape{
    int height , base;
    String color;
    public Triangle (String color ,int height , int base){
        this.color =color;
        this.height =height;
        this.base = base;
    }
    @Override
    public double calculateArea(){
        return (this.height*this.base)/2;
    }
    @Override
    public double calculatePerimeter(){
        return ((height+base)+Math.sqrt(height^2+base^2));
    }
}

