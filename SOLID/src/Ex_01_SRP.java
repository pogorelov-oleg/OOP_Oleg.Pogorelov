import java.util.Date;

public class Ex_01_SRP {

    /**
     * Класс хринит информацию о сотруднике
     */
    public class Employee {
        private String name;
        private Date dob;

        public Employee(String name, Date dob, int baseSalary) {
            this.name = name;
            this.dob = dob;
        }

        /**
         * @return выводит в консоль информацию о сотруднике
         */
        public String getEmpInfo() {
            return "name - " + name + " , dob - " + dob.toString();
        }
    }

    /**
     * Класс хранит информацию о его и
     * выполняет операции с ней
     */
    public class Salary {
        private int baseSalary; // Зарплата сотрудника

        public Salary(int baseSalary) {
            this.baseSalary = baseSalary;
        }

        /**
         * @return возвращает чистую зарплату (на руки)
         */
        public int calculateNetSalary(int index) {
            int tax = (int) (this.baseSalary * 0.25);// считает размер налога
            return this.baseSalary - tax;
        }

        public int getBaseSalary() {
            return baseSalary;
        }

        public void setBaseSalary(int baseSalary) {
            this.baseSalary = baseSalary;
        }
    }
}