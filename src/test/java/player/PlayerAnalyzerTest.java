package player;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Utils;

import java.util.Collections;
import java.util.List;

public class PlayerAnalyzerTest {

    private final PlayerAnalyzer playerAnalyzer = new PlayerAnalyzer();

    @Test
    void playerAnalyzerNormalPlayerTest() {
        List<Player> players = List.of(Utils.createPlayer(25, 5, List.of(2, 2, 2)));

        Assertions.assertEquals(250, playerAnalyzer.calculateScore(players));
    }

    @Test
    void playerAnalyzerJuniorPlayerTest() {
        List<Player> players = List.of(Utils.createPlayer(15, 3, List.of(3, 3, 3)));

        Assertions.assertEquals(67.5, playerAnalyzer.calculateScore(players));
    }

    @Test
    void playerAnalyzerSeniorPlayerTest() {
        List<Player> players = List.of(Utils.createPlayer(35, 15, List.of(4, 4, 4)));

        Assertions.assertEquals(2520, playerAnalyzer.calculateScore(players));
    }

    @Test
    void playerAnalyzerMultiplePlayersTest() {
        List<Player> players = List.of(
                Utils.createPlayer(15, 3, List.of(3, 3, 3)),
                Utils.createPlayer(25, 5, List.of(2, 2, 2)),
                Utils.createPlayer(35, 15, List.of(4, 4, 4)));

        Assertions.assertEquals(2837.5, playerAnalyzer.calculateScore(players));
    }

    @Test
    void playerAnalyzerNullTest() {

        Assertions.assertThrows(NullPointerException.class, () -> playerAnalyzer.calculateScore(null));
    }

    @Test
    void playerAnalyzerEmptyArrayTest() {

        Assertions.assertEquals(0, playerAnalyzer.calculateScore(Collections.emptyList()));
    }
}
