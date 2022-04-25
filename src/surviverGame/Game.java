package surviverGame;

import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner sc = new Scanner(System.in);

    public void login(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Survivor oyununa hosgeldiniz!");
        System.out.println("Oyuna baslamadan once isminizi giriniz");
        String playerName=sc.nextLine();
        player=new Player(playerName);
        player.selectCha();
        start();



    }
    public void start(){
        while(true){
            System.out.println();
            System.out.println("----------------------------------------------");
            System.out.println();
            System.out.println("Eylemi gerceklestirmek icin bir yer seciniz");
            System.out.println("1-Guvenli ev-->Size ait guvenli ev, dusman yok");
            System.out.println("2-Magara->Karsiniza zombi cikabilir");
            System.out.println("3-Orman->Karsiniza vampir cikabilir");
            System.out.println("4-Nehir->Karsiniza ayi cikabilir");
            System.out.println("5-Magaza->Silah veya zirh alabilirsiniz");
            System.out.print("Gitmek istediginiz yer : ");
            int selLoc= sc.nextInt();;
            while(selLoc< 0 || selLoc>5){
                System.out.print("Lutfen gecerli bir yer seciniz");
                selLoc=sc.nextInt();
            }
            switch(selLoc){
                case 1:
                    location=new SafeHouse((player));break;
                default:
                    location=new SafeHouse((player));
            }
            if(!location.getLocation()){
                System.out.println("Oyun bitti");
                break;
            }
        }
    }
}
