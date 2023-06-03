import java.util.Random;

public class randomnumbergenerator {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Longs value : " + random.longs());
        System.out.println("Random Integer value : " + random.nextInt());
    }
}

// output..
/*
 * javac randomnumbergenerator.java && java randomnumbergenerator
 * Longs value : java.util.stream.LongPipeline$Head@3419866c
 * Random Integer value : 2044610592
 */
