public class Position {
    private int x;
    private int y ;

    public Position(int x_, int y_){
        this.x = x_;
        this.y = y_;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean equals(Position position){
        return (x == position.getX() && y == position.getY());

    }

}
