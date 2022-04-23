package nisan23;

public class MethodlarReturnVoid {
    static int power(int a, int b){//kuvvet alma
        int result=1;
        for(int i=1; i<b; i++){
            result *=a;
        }
       // System.out.println(result); bu sadece yukaridaki kodu yazdirir, baska method icine cagrilmasini saglamaz
        return result;//result un yerine ne dondurmek istiyorsan onu yazmalisin

    }
    public static void main(String[] args) {
        int r =power(2,3);//power methodundaki bilgileri buraya cagirabilmek icin
                        //return kullanilmalidir

        System.out.println(r);
        System.out.println(power(4, 7));

    }
}
