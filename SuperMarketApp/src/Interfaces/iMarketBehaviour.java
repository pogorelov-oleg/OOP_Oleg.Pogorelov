package Interfaces;

import java.util.List;
import Classes.Actor;

/**
 * Интерфейс поведения магазина
 */
public interface iMarketBehaviour {

    /**
     * Метод описывает прибытие клиента в магазин
     * 
     * @param actor экземпляр клиента (интерфейса iActorBehaviour)
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * Метод описывает уход клиентов из магазина
     * 
     * @param actors список экземпляров клиентов, которые покинут магазин
     */
    void releaseFromMarket(List<Actor> actors);
     /**
     * Метод описывает возврат денег клиенту
     * 
     * @param actor пронимает экземпляр клиента, которому нужно вернуть деньги
     */
    public void returnMoney(iActorBehaviour actor);

    /**
     * Метод описывает действия клиента в очереди
     */
    void update();
}