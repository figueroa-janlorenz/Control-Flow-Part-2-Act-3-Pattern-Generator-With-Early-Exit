package pattern.generator.with.early.exit;

public class PatternGeneratorWithEarlyExit {

    public static void main(String[] args) {
        
        int size = 5;

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == 4) {
                    break; // break stops the inner loop when j reaches 4.
                }

                if (j == 2) {
                    continue; // continue skips printing the number 2.
                }

                System.out.print("* ");
            }
        }    
    }
    
}
