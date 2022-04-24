package surviverGame;

import java.util.Scanner;

public class Game {
    Player player;
    Location location;

    public void login(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Survivor oyununa hosgeldiniz!");
        System.out.println("Oyuna baslamadan once isminizi giriniz");
        String playerName=sc.nextLine();
        player=new Player(playerName);
        player.selectCha();



    }
}
