package sport;

import sport.sport_goods.Boots;
import sport.sport_goods.Dress;

public class Shop {
    private Boots sportBoots;
    private Dress dress;
    private String name;

    public Shop(){}

    public Shop(Boots sportBoots, Dress dress) {
        this.sportBoots = sportBoots;
        this.dress = dress;
    }

    public Boots getSportBoots() {
        return sportBoots;
    }

    public Dress getDress() {
        return dress;
    }

    public void setDress(Dress dress) {
        this.dress = dress;
    }

    public void setSportBoots(Boots sportBoots) {
        this.sportBoots = sportBoots;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
