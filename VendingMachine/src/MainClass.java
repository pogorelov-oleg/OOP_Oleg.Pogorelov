import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import Services.CoinDispenser;
import Services.Holder;
import Services.VendingMachine;

public class MainClass {
    public static void main(String[] args) throws Exception {
        List<Product> assort = new ArrayList<>();

        Product item1 = new Product("Lays", 90);
        Product item2 = new Bottle("Cola", 80, 0.5);
        Product item3 = new Bottle("Mineral water", 30, 1.5);
        Product item4 = new HotDrink("Coffe", 40, 40);
        Product item5 = new HotDrink("Black tea", 25, 40);
        Product item6 = new HotDrink("Mulled vine", 150, 35);

        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);
        assort.add(item6);

        Holder hold1 = new Holder(2, 3); // TODO сделать, чтобы окно меняло размер, в зависимости от колличества строк и столбов
        CoinDispenser coinDisp = new CoinDispenser();
        VendingMachine venMach1 = new VendingMachine(hold1, coinDisp, assort);

        for (Product prod : venMach1.getProductList()) {
            System.out.println(prod);
        }

        MainFrame myFrame = new MainFrame(venMach1);
        myFrame.initialize();
    }
}