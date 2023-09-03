import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionalClietnt;
import Classes.VipClient;
import Classes.TaxInspector;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {

        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Олег", "return");
        magnit.acceptToMarket(client1);

        iActorBehaviour client2 = new VipClient("Сын маминой подруги", "purchase", 1);
        magnit.acceptToMarket(client2);

        iActorBehaviour client3 = new TaxInspector();
        magnit.acceptToMarket(client3);

        iActorBehaviour client4 = new PromotionalClietnt("Василий", "ВСЕ ПО 10", "purchase");
        magnit.acceptToMarket(client4);

        iActorBehaviour client5 = new PromotionalClietnt("Евгений", "1 + 1 = 3", "purchase");
        magnit.acceptToMarket(client5);

        iActorBehaviour client6 = new PromotionalClietnt("Ольга", "ОСЕННЯЯ РАСПРОДАЖА КАБАЧКОВ", "purchase");
        magnit.acceptToMarket(client6);

        iActorBehaviour client7 = new PromotionalClietnt("Сансызбай", "ВСЕ ПО 10", "purchase");
        magnit.acceptToMarket(client7);

        magnit.update();

    }
}