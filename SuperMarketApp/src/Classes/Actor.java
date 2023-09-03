package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Абстрактный класс(шаблон) для создания экземпляра клиента
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder {
    /**
     * Имя клиента
     */
    protected String name;
    /**
     * Параметр, который показывает получил ли клиент заказ (булево)
     */
    protected boolean isTakeOrder;
    /**
     * Параметр, который показывает сделал ли клиент заказ (булево)
     */
    protected boolean isMakeOrder;
    /**
     * Параметр, который показывает показывает, оформил ли клиент заказ возврат
     * (булево)
     */
    protected boolean isReturn;
    /**
     * Параметр, который сообщает о цели клиента ("purchase", "return",
     * "inscection")
     */
    protected String actorStatus;

    /**
     * Конструктор класса Actor
     * 
     * @param name принимает имя клиента
     */
    public Actor(String name, String actorStatus) {
        this.name = name;
        this.actorStatus = actorStatus;
    }

    /**
     * Абстрактный метод класса Actor для изменения имени клиента
     * 
     * @param name принимает имя клиента
     */
    abstract public void setName(String name);

    /**
     * Абстрактный метод класса Actor для получения имени клиента
     */
    abstract public String getName();

    /**
     * Cообщает о цели клиента
     * 
     * @return возвращает одно из значений "purchase", "return",
     *         "inscection"
     */
    abstract public String getActorStatus();
}