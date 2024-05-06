package solid.liskov;

public class Shape {
    private Integer length;
    private Integer breadth;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getBreadth() {
        return breadth;
    }

    public void setBreadth(Integer breadth) {
        this.breadth = breadth;
    }

    public Shape(Integer length, Integer breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Shape() {
    }
}
