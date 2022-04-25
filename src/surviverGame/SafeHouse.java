package surviverGame;

public class SafeHouse extends NormalLocation{

    SafeHouse(Player player) {
        super(player, "Guvenli Ev");
    }

    @Override
    public boolean getLocation() {
        player.setHealthy(player.getHealthy());
        System.out.println("Canlariniz doldu");
        System.out.println("Su an guvenli evdesiniz");
        return true;
    }
}
