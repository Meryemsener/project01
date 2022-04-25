package surviverGame;

import java.util.Scanner;

public class Player {
    private int damage, healthy, money,rHealthy;
    private String name, cName;
    private Inventory inv;
    Scanner sc = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public void selectCha() {
        switch (chaMenu()) {
            case 1:
                initPlayer("Samuray",5,21,15);
                /*
                setcName("Samuray");
                setDamage(5);
                setHealty(21);
                setMoney(15);*/
                break;
            case 2:
                initPlayer("Okcu",7,18,20);
               /*
                setcName("Okcu");
                setDamage(7);
                setHealty(18);
                setMoney(20);
                */
                break;
            case 3:
                initPlayer("sovalye", 8,24,5);
                /*
                setcName("Sovalye");
                setDamage(8);
                setHealty(24);
                setMoney(5);*/
                break;
            default:
                initPlayer("Samuray",5,21,15);
                //ola ki gozden bir sey kacmsi ihtimaline karsi bu oyuncu otomatik secilsin
                /*
                setcName("Samuray");
                setDamage(5);
                setHealty(21);
                setMoney(15);*/
                break;

        }
        System.out.println("Karakter : "+getcName()+"\t Hasar : "+getDamage()+"\tSaglik : "+getHealthy()+"\t Para : "+getMoney());
    }

    public int chaMenu() {
        System.out.println("Lutfen bir karakter seciniz : ");
        System.out.println(" 1- Samuray \t Hasar : 5 \t Saglik : 21 \t Para : 15");
        System.out.println(" 2- Okcu    \t Hasar : 7 \t Saglik : 18 \t Para : 20");
        System.out.println(" 3- Sovalye \t Hasar : 8 \t Saglik : 24 \t Para : 5");
        System.out.println("Karakter Seciminiz ");
        int chaId = sc.nextInt();
        while (chaId < 1 || chaId > 3) {
            System.out.println("Lutfen gecerli bir karakter seciniz");
            chaId = sc.nextInt();

        }

        return chaId;
    }
    public void initPlayer(String cName, int dmg, int hlthy, int mny){
        setcName(cName);
        setDamage(dmg);
        setHealthy(hlthy);
        setMoney(mny);
        setHealthy(hlthy);

    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getrHealthy() {
        return rHealthy;
    }

    public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }
}
