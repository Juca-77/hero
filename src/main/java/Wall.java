import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

import java.util.List;

public class Wall {
    private int c_;
    private int i_;

    public Wall(int c, int i) {
        this.c_=c;
        this.i_=i;
    }

    public void draw(TextGraphics graphics) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(c_, i_), "I");
    }

    public Position getPosition() {
        Position p = new Position(c_,i_);
        return p;
    }
}





