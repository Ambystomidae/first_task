import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class Tests {
    @Test
    void basetest(){
        tictactoe example = new tictactoe( 3 );
        example.setcell(0,0,2);
        example.setcell(1,1,2);
        example.setcell(0,2,1);
        example.setcell(1,2,1);
        example.setcell(2,2,1);
        example.paintfield();
        assertEquals(3 ,example.crosssequencesearch());
        assertEquals(2 ,example.toesequencesearch());
    }
    @Test
    void basetest1(){
        tictactoe example = new tictactoe( 5 );
        example.setcell(0,0,2);
        example.setcell(1,1,2);
        example.setcell(3,3,2);
        example.setcell(4,4,2);
        example.setcell(0,2,1);
        example.setcell(1,2,1);
        example.setcell(2,2,1);
        example.setcell(4,0,2);
        example.setcell(4,1,2);
        example.setcell(4,2,2);
        example.setcell(4,3,2);
        example.setcell(4,4,2);
        example.setcell(0,4,1);
        example.setcell(1,4,1);
        example.paintfield();
        assertEquals(3 ,example.crosssequencesearch());
        assertEquals(5 ,example.toesequencesearch());
    }
    @Test
    void basetest2(){
        int[][] field = {{1,2,2}, {2,1,0}, {0,2,1}};
        tictactoe example = new tictactoe(3);
        example.setcell(0,0,1);
        example.setcell(0,1,2);
        example.setcell(0,2,2);
        example.setcell(1,0,2);
        example.setcell(1,1,1);
        example.setcell(2,2,1);
        example.setcell(2,1,2);
        assertTrue(example.equals(field));
    }
    @Test
    void basetest3(){
        String temp1 = "122210021";
        String temp2 = "120000021";
        tictactoe example = new tictactoe(3);
        example.setcell(0,0,1);
        example.setcell(0,1,2);
        example.setcell(0,2,2);
        example.setcell(1,0,2);
        example.setcell(1,1,1);
        example.setcell(2,2,1);
        example.setcell(2,1,2);
        assertTrue(example.tostring().equals(temp1));
        assertFalse(example.tostring().equals(temp2));
    }
}
