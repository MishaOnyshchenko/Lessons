package sport;

public class MostCity {

    private int shopCountInShopMass= 10;
    private Shop []shopMass;


    public MostCity() {
        this.shopMass = new Shop [shopCountInShopMass];
    }

    public Shop[] getShopMass() {
        return shopMass;
    }

    public void setShopMass(Shop[] shopMass) {
        this.shopMass = shopMass;
    }

    public void addShopToShopMass(Shop shop){
        for(int i = 0; i < shopMass.length;i++){

            if(shopMass [i] == null){
                shopMass[i] = shop;
                break;
            }
        }
    }

    public void showAllShops(){
        for (Shop shop : this.shopMass){
            if (shop!= null) {
                System.out.println(shop.getName());
            }
        }
    }
     public void showOneShop(){

     }

}
