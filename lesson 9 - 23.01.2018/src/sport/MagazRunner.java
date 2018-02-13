package sport;

import sport.sport_goods.Boots;
import sport.sport_goods.Dress;
import sport.sport_goods.Info;

public class MagazRunner {


    public static void main(String[] args) {

        MostCity mostCity = new MostCity();



        Shop shop = new Shop();
        Info info = new Info();
        info.setAdr("district");
        Boots boots = new Boots(15, "Nike", 50);
        //boots.setInfo(info);
        Dress dress = new Dress();
        shop.setSportBoots(boots);
        shop.setDress(dress);
        //System.out.println(shop.getSportBoots().getInfo().getAdr());

        mostCity.addShopToShopMass(shop);
        Shop shop1 = new Shop();
        shop1.setName("good shop");

        mostCity.addShopToShopMass(shop1);

        mostCity.showAllShops();


    }
}
