package nisan23;

public class Methodlar {
    //fonksiyonlar

    public static void main(String[] args) {
        f(4);
        f(12);
        power(2,4);//2nin 4. kuvvetini alma

    }
    static void f(int x){//f methodu icinde int tipinde bir parametre tanimladik
        //icine de islemi yaptik ve yukarida main method da cagirdik
        //f(4) dedik bize islemi yapip getirdi
        int result=(x+2)*6;
        System.out.println(result);

    }
    static void power(int number1, int number2){
        int result=1;
        for(int i=1; i<=number2;i++){
            result*=number1;
        }
        System.out.println("cevap : "+result);
    }
}
