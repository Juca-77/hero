import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PositionTest {

        private Position position;
        private Position test_1position;
        private Position test_2position;
        @BeforeEach
        public void helper(){
            position = new Position(10,5);
            test_1position = new Position(10,5);

        }
        @Test
        public void setPositionTest(){
            int xp= position.getX();
            int yp = position.getY();
            int x1 = test_1position.getX();
            int y1 = test_1position.getY();
            Assertions.assertEquals(xp,x1&yp,xp);
        }
    }


