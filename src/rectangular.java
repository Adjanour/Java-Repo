public class rectangular {
    private double length = 1.0;
    private double breadth = 1.0;
    private double height = 1.0;


    rectangular(){}

    rectangular(double length, double breadth , double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    rectangular(double length, double breadth){
        this.length= length;
        this.breadth = breadth;
    }

    rectangular( int length, int breadth){

    }


    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getHeight() {
        return height;
    }



    public double Area(){
        return length * breadth;
    }

    public double volume(){
        return length * breadth * height;
    }


}