import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void add() {
        FilmManager manager = new FilmManager();

        String[] expacted = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expacted, actual);
    }

    @Test
    public void addingMovie() {
        FilmManager manager = new FilmManager();

        manager.newfilm("Movie 1");

        String[] expacted = {"Movie 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expacted, actual);
    }

    @Test
    public void addingMoreMovies() {
        FilmManager manager = new FilmManager();

        manager.newfilm("Movie 1");
        manager.newfilm("Movie 2");
        manager.newfilm("Movie 3");

        String[] expacted = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expacted, actual);
    }

    @Test
    public void showTheLatestAddedMovies() {
        FilmManager manager = new FilmManager();

        manager.newfilm("Movie 1");
        manager.newfilm("Movie 2");
        manager.newfilm("Movie 3");

        String[] expacted = {"Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expacted, actual);
    }

    @Test
    public void limitedMovies() {
        FilmManager manager = new FilmManager(6);

        manager.newfilm("Movie 1");
        manager.newfilm("Movie 2");
        manager.newfilm("Movie 3");
        manager.newfilm("Movie 4");
        manager.newfilm("Movie 5");
        manager.newfilm("Movie 6");
        manager.newfilm("Movie 7");
        manager.newfilm("Movie 8");

        String[] expacted = {"Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expacted, actual);
    }

}
