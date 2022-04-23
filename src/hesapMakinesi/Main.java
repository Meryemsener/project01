package hesapMakinesi;

public class Main {
    public static void main(String[] args) {
        //Sinif adi objeadi=new Sinifadi();

        HesapMakinesi1 makine1=new HesapMakinesi1();
        makine1.sayi1=10;
        makine1.sayi2=2;
        System.out.println(makine1.sayi1);

        HesapMakinesi1 makine2=new HesapMakinesi1();
        makine2.sayi1=20;
        System.out.println(makine2.sayi1);
    }
}
