import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class Arena {

    private int width;
    private int height;
    private Hero hero;

    public Arena(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void set_hero(Hero hero){
        this.hero = hero;
    }

    public void processKey(KeyStroke key,Screen screen) throws IOException {
        System.out.println(key);
        if (key.getKeyType() == KeyType.ArrowUp) {
            moveHero(hero.moveUp());
            draw(screen);
        }
        if (key.getKeyType() == KeyType.ArrowLeft) {
            moveHero(hero.moveLeft());
            draw(screen);
        }
        if (key.getKeyType() == KeyType.ArrowRight) {
            moveHero(hero.moveRight());
            draw(screen);
        }
        if (key.getKeyType() == KeyType.ArrowDown) {
            moveHero(hero.moveDown());
            draw(screen);
        }
        if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'q') {
            screen.close();
        }

      

    }

    public void moveHero(Position position) {
        if (canHeroMove(position))
            hero.setPosition(position);
    }

    private boolean canHeroMove(Position position) {
        if((position.getX()>width-1)||(position.getX()<0)||(position.getY()>height-1)||(position.getY()<0)){
            return false;
        }
        else{
            return true;
        }
    }
    public void draw(Screen screen) throws IOException {
        screen.clear();
        hero.draw(screen);
        screen.refresh();

    }


}
