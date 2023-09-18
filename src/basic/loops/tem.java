package basic.loops;
import java.io.*;
import java.util.Scanner;

class tem{
    public static void main(String[] args) throws IOException {
        Scanner get = new Scanner(System.in);
        String s = get.nextLine();
        int len =  s.length();
        for (int i = 0; i <len; i++){
            char temC = s.charAt(i);
            int temInt = (int) temC;
            System.out.print(temInt);
        }
        
    }
}