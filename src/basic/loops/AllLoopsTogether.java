package basic.loops;

public class AllLoopsTogether {
    public static void main(String[] args) {
        // for loops
        for (int counter = 0; counter <= 100; counter++){
            System.out.println(counter);
        }
        // while loops

        int counter = 0;
        while (counter <= 100){
            System.out.println(counter);
            counter++;
        }

        // do while loops

        counter = 0;
        do {
            System.out.println(counter);
            counter++;
        } while(counter <= 100);
    }
}
