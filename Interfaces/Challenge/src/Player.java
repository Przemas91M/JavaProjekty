import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> returnList = new ArrayList<>();
        returnList.add(this.getName());
        returnList.add(this.getWeapon());
        returnList.add(Integer.toString(getHitPoints()));
        returnList.add(Integer.toString(getStrength()));
        return returnList;
    }

    @Override
    public void read(List<String> list) {
        if(list != null && list.size() > 0) {
            setName(list.get(0));
            setWeapon(list.get(1));
            setHitPoints(Integer.parseInt(list.get(2)));
            setStrength(Integer.parseInt(list.get(3)));
        }
    }

    @Override
    public String toString(){
        return "Player{name='" + this.name +
                "', hitPoints=" + this.hitPoints +
                ", strength=" + this.strength +
                ", weapon='" + this.weapon + "'}";
    }
}
