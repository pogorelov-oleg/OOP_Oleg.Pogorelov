package Interfaces;

import Classes.Actor;

/**
 * Интерфейс поведения клиента
 */
public interface iActorBehaviour {
    /**
     * Возвращает параметр, который показывает получил ли клиент заказ (булево)
     */
    public boolean isTakeOrder();

    /**
     * Возвращает параметр, который показывает сделал ли клиент заказ (булево)
     */
    public boolean isMakeOrder();

    /**
     * Устанавливает параметр, который показывает получил ли клиент заказ (булево)
     * 
     * @param take true/false
     */
    public void setTakeOrder(boolean take);

    /**
     * Устанавливает параметр, который показывает сделал ли клиент заказ (булево)
     * 
     * @param make true/false
     */
    public void setMakeOrder(boolean make);

    /**
     * @return возвращает экземпляр клиента
     */
    Actor getActor();
}