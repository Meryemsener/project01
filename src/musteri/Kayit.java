package musteri;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {

List<Kullanici> kisiler=new ArrayList<>();//bos list .kayitAl() method bu liste element atayacak

    public List<Kullanici> kayitAl(){
        Scanner sc=new Scanner(System.in);
        System.out.println("adinizi giriniz : ");
        String isim= sc.nextLine();
        Kullanici kisi=new Kullanici(isim, LocalDateTime.now());//kullanici class'tan parametreli conts ile obje create idildi
        kisiler.add(kisi);

        return kisiler;
    }

public void sansliKullanici(List<Kullanici>kll){//sansli kullanici methodu listteki kulllanicilari alacak
    for (Kullanici k:kll) {
        if(k.kayitZamani.getSecond()<=10);

    }
}
}
