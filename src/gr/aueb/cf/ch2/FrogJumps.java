package gr.aueb.cf.ch2;



/**
 * X = 10 where we start
 * Y = 85 where we want to end up
 * D = 30 how many hops the frog does
 *
 * Jumps = 3;
 * 10 + 30 = 40
 * 40 + 30 = 70
 * 70  + 30 = 100
 */
public class FrogJumps {
    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        //calculate jumps
        //ceil gives a double, in this case 3.0 so we need
        //to turn it back into int
        jumps = (int) Math.ceil((target-start )/ (double) hop);

        System.out.println("Jumps: " +jumps);
    }
}
