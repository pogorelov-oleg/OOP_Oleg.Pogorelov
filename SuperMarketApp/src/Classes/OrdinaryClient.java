package Classes;

/**
 * Класс для создания экземпляра обычного покупателя. Наследник абстрактного
 * класса Actor
 */
public class OrdinaryClient extends Actor {

    /**
     * Конструктор класса OrdinaryClient
     * 
     * @param name        наследует имя у класса Actor
     * @param actorStatus наследует параметр, который сообщает о цели клиента
     *                    ("purchase", "return", "inscection") у класса Actor
     */
    public OrdinaryClient(String name, String actorStatus) {
        super(name, actorStatus);
    }

    /**
     * Возвращает параметр класса Actor, который показывает получил ли клиент заказ
     * (булево)
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Устанавливает параметр класса Actor, который показывает получил ли клиент
     * заказ (булево)
     */
    public void setTakeOrder(boolean takenOrder) {
        super.isTakeOrder = takenOrder;
    }

    /**
     * Возвращает параметр класса Actor, который показывает сделал ли клиент заказ
     * (булево)
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Устанавливает параметр класса Actor, который показывает сделал ли клиент
     * заказ (булево)
     */
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /**
     * Возвращает экземпляр класса OrdinaryClient
     */
    public Actor getActor() {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public String getActorStatus() {
        return super.actorStatus;
    }

    @Override
    public boolean isReturn() {
        return super.isReturn;
    }

    @Override
    public void setReturn(boolean ordered) {
        super.isReturn = ordered;
    }

    @Override
    public void returnOrder() {
        System.out.println("\u001B[36mКлиент " + super.name + " вернул товар\u001B[0m");
    }

    

}