public class Rectangle{
    private double length;
    private double width;

    public Rectangle(double w, double l){
        length = l;
        width = w;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    public double getArea(){
        return width*length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

}