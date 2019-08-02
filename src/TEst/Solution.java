package TEst;

import java.io.*;
import java.util.*;

public class Solution {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String number1 = reader.readLine();
            int a = Integer.parseInt(number1);
            String number2 = reader.readLine();
            int b = Integer.parseInt(number2);
            String number3 = reader.readLine();
            int c = Integer.parseInt(number3);
            if(a==b & b==c & a==c)
                System.out.println(a +" "+ b +" " + c);
            if (a==b & a!=c)
                System.out.println(a + " "+b);
            if(b==c & c!=a)
                System.out.println(b +" "+ c);
            if(a==c & c!=b)
                System.out.println(a+" "+ c);
            //напишите тут ваш код

        }
    }

