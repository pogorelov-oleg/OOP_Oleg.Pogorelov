public class Ex_02_OCP {

    /**
     * Клсаа для операций рассчета скорости
     */
    public class SpeedCalculation {
        /**
         * Рассчитывает допустимую скорость
         * 
         * @param vehicle экземпляр транспортного средства
         * @return возвраает допустимую скорость
         */
        public double calculateAllowedSpeed(Vehicle vehicle) {
            return vehicle.getMaxSpeed() * vehicle.getSpeedRate();
        }
    }

    /**
     * Родительский класс транспортных средств.
     */
    public class Vehicle {
        private int maxSpeed;
        private String type;
        private double speedRate; // коэффицент для расчета допустимой скорости (по умолчанию null)

        public Vehicle(int maxSpeed, String type) {
            this.maxSpeed = maxSpeed;
            this.type = type;
        }

        public int getMaxSpeed() {
            return this.maxSpeed;
        }

        public String getType() {
            return this.type;
        }

        public double getSpeedRate() {
            return speedRate;
        }
    }

    /**
     * Дочерний класс наследник Vehicle
     */
    public class Car extends Vehicle {

        public Car(int maxSpeed, String type) {
            super(maxSpeed, type);
            super.speedRate = 0.8;
        }

        /**
         * Дает возможность изменить коэффицент
         * @param speedRate коэффицент для расчета допустимой скорости (по умолчанию 0,8)
         */
        public void setSpeedRate(double speedRate) {
            super.speedRate = speedRate;
        }
    }

    /**
     * Дочерний класс наследник Vehicle
     */
    public class Bus extends Vehicle {

        public Bus(int maxSpeed, String type) {
            super(maxSpeed, type);
            super.speedRate = 0.6;
        }

        /**
         * Дает возможность изменить коэффицент
         * @param speedRate коэффицент для расчета допустимой скорости (по умолчанию 0,6)
         */
        public void setSpeedRate(double speedRate) {
            super.speedRate = speedRate;
        }
    }
}

