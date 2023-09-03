package Interfaces;

/**
 * Интерфейс возврата товара
 */
public interface iReturnOrder {

    /**
     * Метод описывает возврат товара в магазин
     */
    public void returnOrder();

    /**
     * Параметр, который показывает показывает, оформил ли клиент заказ возврат
     * (булево)
     */
    public boolean isReturn();

    /**
     * Устанавливает параметр, который показывает, оформил ли клиент заказ возврат
     * (булево)
     */
    public void setReturn(boolean orderedReturn);

}
