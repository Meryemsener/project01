package nisan23;

public class Overloading {
    //asiri yuklenme :)
    public static void main(String[] args) {
        System.out.println(add(2,5));
        System.out.println(add(5,7,8));
        System.out.println(add(5,7,8.5));

    }
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static double add(int a, int b, double d){
        return a+b+d;
    }
}
