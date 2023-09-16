public class Ex_05_DIP {

    /**
     * Класс для создания экземпляра автомобиля
     */
    public class Car {
        private iEngine engine;

        public Car(iEngine engine) {
            this.engine = engine;
        }

        public void start() {
            this.engine.start();
        }
    }

    /**
     * Класс для работы с бензиновым двигателем
     */
    public class PetrolEngine implements iEngine {
        @Override
        public void start() {
        }
    }

    /**
     * Класс для работы с дизельным двигателем
     */
    public class DiselEngine implements iEngine {
        @Override
        public void start() {
        }
    }

    /**
     * Интерфейс для работы с разным типом топлива
     */
    public interface iEngine {
        public void start();
    }

}
