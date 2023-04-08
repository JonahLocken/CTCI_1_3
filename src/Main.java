import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //URLify. Write a method that replaces all spaces in a given string with '%20'

        String name = "Hi My Name is Jonah Locken";

        Scanner inScan = new Scanner(System.in);

        urlIfy(inScan.nextLine());
    }

    //urlIfy method takes a single String as input and converts the given string to url formatting through the use of concatenation and with a hashmap.
    //This solution is O(n) but is relatively space inefficient. An improvement to this could be made with the use of a StringBuilder rather than concatenation.
    private static String urlIfy(String in){
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        String str = "";

        for(int i = 0; i < in.length(); i++){

            //ensuring that any spaces in the given string are being stored in the hashmap as %20 instead. 
            if(in.charAt(i) == ' '){
                hash.put(i, "%20");
            }
            //if no space, add the character that is not a space to the hashmap.
            else
            {
                hash.put(i, String.valueOf(in.charAt(i)));
            }
            //add characters onto empty String
            str += hash.get(i);
        }

        System.out.println(str);
        return str;
    }
}