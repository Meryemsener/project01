package interviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q01_CountsOfCharacters2Yol {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.print("bir cumle kelime giriniz : ");
        String str=scan.nextLine();
        String arr[]=str.split("");
        Arrays.sort(arr);
        int sayac=0;


        Map<String, Integer> kelimeMap=new HashMap<>();
        for (String w:arr) {
            if(kelimeMap.containsKey(w))//varsa key
                kelimeMap.put(w,kelimeMap.get(w)+1);//artir
            else kelimeMap.put(w,1);
        }
        System.out.println(kelimeMap);

    }


}
