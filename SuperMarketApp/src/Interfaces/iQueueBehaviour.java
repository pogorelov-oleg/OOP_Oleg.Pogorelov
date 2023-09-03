package Interfaces;

/**
 * Интерфейс поведения клиента в очереди
 */
public interface iQueueBehaviour {

    /**
     * Метод описывает добавление клиента в очередь
     * 
     * @param actor экземпляр клиента (интерфейса iActorBehaviour)
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * Метод описывает уход клиента из очереди
     */
    void releaseFromQueue();

    /**
     * Метод описывает заказ клиента
     */
    void takeOrder();

    /**
     * Метод описывает получение заказа клиентом
     */
    void giveOrder();
}