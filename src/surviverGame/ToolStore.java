package surviverGame;

public abstract class ToolStore extends NormalLocation {

    ToolStore(Player player) {
        super(player, "Magaza");
    }

    public boolean getLocation() {
        System.out.println("para : " + player.getMoney());
        System.out.println("1.Silahlar");
        System.out.println("2.Zirh");
        System.out.println("3.Cikis");
        System.out.println("Seciminiz : ");
        int selTool = sc.nextInt();
        int selItmeId;

        switch (selTool) {
            case 1:
                selItmeId =weaponMenu();
                //buyWeapon(selItmeId);
                break;
            case 2:
                break;
            default:
                break;

        }
        return true;
    }
    public  int weaponMenu(){
        System.out.println("1-Tabanca <Para :  25 - HAsar : 2> ");
        System.out.println("2-Kilic <Para :  35 - HAsar : 3> ");
        System.out.println("3-Tufek <Para :  45 - HAsar : 7> ");
        System.out.println("4-Cikis");
        System.out.println("Silahi Seciniz : ");
        int selWeponId= sc.nextInt();
        return selWeponId;
    }
}
