package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class BoardTest {

    @Test
    void testValidBoard() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        Board board = new Board(grid);

        Square square = board.squareAt(0, 0);
        assertThat(square).isNotNull();
        assertThat(square).isInstanceOf(BasicSquare.class);
    }

    @Test
    void testBoardWithNullSquare() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;

        assertThrows(AssertionError.class, () -> {
            new Board(grid);
        });
    }

}
