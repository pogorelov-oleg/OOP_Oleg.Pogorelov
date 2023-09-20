import View.ViewCalculator;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * Создание калькулятора. В зависимости от выбора калькулятора , вибирается
         * экземпляр подходящего калькулятора и запускается соответствующий метод run
         * (выбор осуществляется в конструкторе ViewCalculator сразу после создания
         * экземпляра)
         */
        ViewCalculator run = new ViewCalculator();

    }
}