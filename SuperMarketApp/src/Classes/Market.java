package Classes;

import java.util.List;
import java.util.ArrayList;
import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;


/**
 * Класс для создания экземпляра магазина. Имплементирует iMarketBehaviour,
 * iQueueBehaviour
 */
public class Market implements iMarketBehaviour, iQueueBehaviour {
    

    /**
     * Очередь клиентов. Используется список экземпляров интерфейса iActorBehaviour
     */
    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * Метод выводит сообщение о том, что клиент прибыл в магазин. Далее вызывет
     * метод takeInQueue (добавление в очередь)
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {

        System.out.println("Клиент " + actor.getActor().getName() + " пришел в магазин ");
        takeInQueue(actor);

        if (actor instanceof PromotionalClietnt
                && PromotionalClietnt.getParticipantCount() <= PromotionalClietnt.getMaxPromotionalClient()) {
            PromotionalClietnt client = (PromotionalClietnt) actor; // создаю копию экземпляра actor, чтобы привести ее
                                                                    // к классу PromotionalClietnt и иметь возможность
                                                                    // обращаться к методам этого класса

            System.out.println("\u001B[32mКлиент " + client.getName() + " участвует в акции '"
                    + client.getPromotionName() + "'\u001B[0m");
        } else if (actor instanceof PromotionalClietnt
                && PromotionalClietnt.getParticipantCount() > PromotionalClietnt.getMaxPromotionalClient()) {
            PromotionalClietnt client = (PromotionalClietnt) actor;

            System.out.println("\u001B[31mКлиент " + client.getName() + " не может принять участие в акции '"
                    + client.getPromotionName() + "', так как превышен лимит участников\u001B[0m");
            PromotionalClietnt.setParticipantCount(-1); // уменьшаем колличество участников на 1
        }
    }

    /**
     * Метод выводит сообщение о том, что клиент добавлен в очередь и добавляет его
     * в список экземпляров интерфейса iActorBehaviour
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println("Клиент " + actor.getActor().getName() + " добавлен в очередь");
    }

    /**
     * Метод принимает список покупателей, получивших заказ и итеративно выводит о
     * каждом сообщение, что клиент покинул магазин. Далее эти клиенты удаляются из
     * очереди
     * 
     * @param actors список покупателей, получивших заказ
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println("Клиент " + actor.getName() + " ушел из магазина ");
            queue.remove(actor);
        }

    }

    /**
     * Метод описывает последовательность действий клиента в очереди
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
        System.out.println("\n\u001B[33mВ различных рекламных акциях сегодня приняло участие "
                + PromotionalClietnt.getParticipantCount() + " клиента\n\u001B[0m");
    }

    /**
     * Метод пробегает по всем клиентам из списка в очереди и если клиент сделал
     * заказ, то устанавливает параметр isTakeOrder (клиент получил заказ) в true и
     * выводит сообщение о том, что клиент получил заказ
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println("Клиент " + actor.getActor().getName() + " получил свой заказ ");
            }
            if (actor.getActor().isReturn) {
                actor.getActor().returnOrder();
                returnMoney(actor);
                actor.getActor().setReturn(false);
                actor.setTakeOrder(true);
            }
            if (actor.getActor().getActorStatus().equals("inspection")) {
                TaxInspector client = (TaxInspector) actor;
                client.returnOrder();
                actor.getActor().setReturn(false);
            }
        }

    }

    /**
     * Метод создает список и добавляет в него клиентов, получивших заказ. Далее
     * итеративно выводит о каждом сообщение, что клиент покинул очередь. Далее этот
     * список передается в метод releaseFromMarket (который описывает уход из
     * магазина)
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println("Клиент " + actor.getActor().getName() + " ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    /**
     * Метод список экземпляров клиентов добавленных в очередь пробегает по ним
     * циклом. Если клиент еще не сделал заказ, значению isMakeOrder присваивается
     * true и выводится сообщение, что клиент сделал заказ
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder() && !actor.getActor().getActorStatus().equals("return")) {
                actor.setMakeOrder(true);
                System.out.println("Клиент " + actor.getActor().getName() + " сделал заказ ");

            } else if (actor.getActor().getActorStatus().equals("return")) {
                System.out.println(
                        "\u001B[36mКлиент " + actor.getActor().getName() + " оформил заявку на возврат\u001B[0m");
                actor.getActor().setReturn(true);
            }
        }
    }

    @Override
    public void returnMoney(iActorBehaviour actor) {
        System.out.println("\u001B[36mКлиент " + actor.getActor().getName() + " получил деньги обратно\u001B[0m");
    }
}