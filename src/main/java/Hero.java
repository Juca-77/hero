import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

public class Hero {
    private int x;
    private int y ;

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
    public Hero(int x, int y){
        setX(x);
        setY(y);
    }
    public void moveUp(){
        y = y-1;
    }
    public void moveDown(){
        y = y+1;
    }public void moveLeft(){
        x = x-1;
    }public void moveRight(){
        x = x+1;
    }
    public void draw(Screen screen){
        screen.setCharacter(x, y, TextCharacter.fromCharacter('X')[0]);


    }
}
