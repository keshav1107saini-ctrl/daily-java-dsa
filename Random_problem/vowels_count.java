package Random_problem;
import java.util.Scanner;
public class vowels_count {
   static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.next();
        System.out.println(vowels(str));
        in.close();
    }
    static int vowels(String str){
        str = str.toLowerCase();
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'|| str.charAt(i)=='e'||str.charAt(i)=='i'
                    ||str.charAt(i)=='o'||str.charAt(i)=='u') {
                count++;
            }
        }
        return count;
    }
    
}

