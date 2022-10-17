public class Square implements Shape {

    private int side;
    
    Square() {
    }

    Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return this.side;
    }

    @Override
    public int getArea() {
        return this.side*this.side;
    }
}
