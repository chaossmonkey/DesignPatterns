package solid.liskov;

public class Square extends Shape{
    public Square(Integer size) {
        super(size, size);
    }

    public Square() {
    }

    @Override
    public void setLength(Integer length) {
        super.setLength(length);
        super.setBreadth(length);
    }

    @Override
    public void setBreadth(Integer breadth) {
        super.setBreadth(breadth);
        super.setLength(breadth);
    }

    @Override
    public Integer getBreadth() {
        return super.getBreadth();
    }

    @Override
    public Integer getLength() {
        return super.getLength();
    }
}
