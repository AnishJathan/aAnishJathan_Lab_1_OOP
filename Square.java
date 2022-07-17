public class Square extends Rectangle {
    public Square(String color,int side){
        super(color,side ,side);
    }
    @Override
    public double calculateArea(){ 
        System.out.println( "Cal area in square");
        return this.length *this.width;
    }

}
