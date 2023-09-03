package Classes;

/**
 * Класс для создания экземпляра акционного покупателя (наследник абстрактного
 * класса Actor)
 */
public class PromotionalClietnt extends Actor {

    /**
     * Название акции
     */
    private String promotionName;
    /**
     * Максимальное колличество участников акции
     */
    private static int maxPromotionalClient; // TODO реализовать отказ при привышении лимита

    /**
     * Счетчик количества созданных экземпляров
     */
    private static int participantCount;

    static {
        participantCount = 0;
        maxPromotionalClient = 3;
    }

    /**
     * Конструктор класса PromotionalClietnt
     * 
     * @param name        наследует имя у класса Actor
     * @param actorStatus наследует параметр, который сообщает о цели клиента
     *                    ("purchase", "return", "inscection") у класса Actor
     */
    public PromotionalClietnt(String name, String promotionName, String actorStatus) {
        super(name, actorStatus);
        this.promotionName = promotionName;
        participantCount++;
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
     * Возвращает экземпляр класса PromotionalClietnt
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

    public String getPromotionName() {
        return this.promotionName;
    }

    public static int getMaxPromotionalClient() {
        return maxPromotionalClient;
    }

    public static int getParticipantCount() {
        return participantCount;
    }

    public static void setParticipantCount(int participantCount) {
        PromotionalClietnt.participantCount += participantCount;
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
        System.out.println("\u001B[36mКлиент " + super.name + " вернул товар");
    }

}
