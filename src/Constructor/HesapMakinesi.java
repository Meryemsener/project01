package Constructor;

public class HesapMakinesi {
    public int sayi1;
    public int sayi2;
    public String renk;
    final static double PI=3.14;//buradaki final acces modifier degistirilmesini istemediginiz datalarin basina yazilir
                    //herhangi bir yerde this.PI=10; gibi bir sey yazarsak otomatik olarak hata verecektir
                    //static keyowrd'u da ekledigimizde her yerden ulasilabilecek bir data elde etmis oluruz
                //ve buna ulasmak icin nesne uretmeye gerek yoktur. Bunun icin hesapmakinesi main sayfasina
                    //gidip  System.out.println(HesapMakinesi.PI); yazmaniz veriyi getireyi saglayacaktir
    HesapMakinesi(int sayi1, int sayi2,String renk){
        this.sayi1=sayi1;
        this.sayi2=sayi2;
        this.renk=renk;

    }
    public int toplama(){
        return this.sayi1+this.sayi2;
    }
    public int cikarma(){
        return this.sayi1-this.sayi2;
    }
    public int carpma(){
        return this.sayi1*this.sayi2;

    }
    public int bolme(){
        return this.sayi1/this.sayi2;
    }
}
