package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Класс для создания экземпляра налогового инспектора (имплементирует интерфейс
 * iActorBehaviour)
 */
public class TaxInspector implements iActorBehaviour, iReturnOrder {

    /**
     * Имя инспектора
     */
    private String name;
    /**
     * Параметр, который показывает получил ли инспектор заказ (булево)
     */
    private boolean isTakeOrder;
    /**
     * Параметр, который показывает сделал ли инспектор заказ (булево)
     */
    private boolean isMakeOrder;
    /**
     * Параметр, который показывает показывает, есть ли у клиента товар на возврат
     * (булево)
     */
    protected boolean isReturn;

    /**
     * Параметр, который сообщает о цели клиента ("purchase", "return",
     * "inspection")
     */
    private String actorStatus;

    /**
     * Конструктор, который присваивает имя инспектору
     */
    public TaxInspector() {
        this.name = "Tax audit";
        this.actorStatus = "inspection";
    }

    /**
     * @return возвращает имя инспектора
     */
    public String getName() {
        return name;
    }

    /**
     * Сообщает о цели клиента
     * 
     * @return возвращает одно из значений "purchase", "return",
     *         "inscection"
     */
    public String getActorStatus() {
        return actorStatus;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean take) {
        isTakeOrder = take;
    }

    @Override
    public void setMakeOrder(boolean make) {
        isMakeOrder = make;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name, actorStatus);
    }

    @Override
    public boolean isReturn() {
        return isReturn;
    }

    @Override
    public void setReturn(boolean ordered) {
        isReturn = ordered;
    }

    @Override
    public void returnOrder() {
        System.out.println("\u001B[36mКлиент " + this.name + " закончил проверку и вернул товар\u001B[0m");
    }

}