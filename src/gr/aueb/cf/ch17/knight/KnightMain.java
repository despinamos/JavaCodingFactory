package gr.aueb.cf.ch17.knight;

public class KnightMain {
    private final static Runnable joan = new Knight("joan");
    private final static Runnable whiteKnight = new Knight("White-knight");
    private final static Runnable saintGeorge = new Knight("Saint George");

    public static void main(String[] args) {
        (new Thread(joan)).start();
        (new Thread(whiteKnight)).start();
        (new Thread(saintGeorge)).start();
    }
}
