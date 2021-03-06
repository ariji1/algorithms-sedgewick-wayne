package chapter4.section2;

/**
 * Created by rene on 02/11/17.
 */
public interface DigraphInterface {

    int vertices();
    int edges();
    Iterable<Integer> adjacent(int vertex);
    DigraphInterface reverse();

}
