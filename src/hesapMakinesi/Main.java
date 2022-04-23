package hesapMakinesi;

public class Main {
    public static void main(String[] args) {
        //Sinif adi objeadi=new Sinifadi();

        HesapMakinesi makine1=new HesapMakinesi();
        makine1.sayi1=10;
        makine1.sayi2=2;
        System.out.println(makine1.sayi1);

        HesapMakinesi makine2=new HesapMakinesi();
        makine2.sayi1=20;
        System.out.println(makine2.sayi1);
    }
}
