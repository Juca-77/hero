import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

public class Hero {
    private Position position;

    public Hero(int i,int j) {
        this.position = new Position(i,j);

    }
    public void setX(int i) {
        position.setX(i);
    }
    public void setY(int i) {
        position.setY(i);
    }


    public Position moveUp() {
        return new Position(position.getX(), position.getY() - 1);
    }
    public Position moveRight() {
        return new Position(position.getX()+1, position.getY());
    }
    public Position moveLeft() {
        return new Position(position.getX()-1, position.getY());
    }
    public Position moveDown() {
        return new Position(position.getX(), position.getY() +1);
    }


    public void draw(TextGraphics graphics) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFF33"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(position.getX(), position.getY()), "X");
    }

    public void setPosition(Position position_) {
            this.position = position_;
        }
    }

