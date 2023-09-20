package View;

import java.util.Scanner;

import Models.Calculators.DecoratorComplex;
import Models.Calculators.DecoratorRegular;
import Models.Calculators.Core.ComplexCalc;
import Models.Calculators.Core.RegularCalc;
import Models.Interfaces.iCalculable;
import Models.Logger;

public class ViewCalculator {
    Scanner in = new Scanner(System.in);

    private iCalculable calculator;

    /**
     * Конструктор. Выодит сообщение с запросом выбора калькулятора, далее
     * устанавливает
     * выбранный пользователем калькулятор (экземпляр iCalculable) и запускает
     * соответствующий run метод
     */
    public ViewCalculator() {
        String userIntut = prompt("\u001B[32mВыберите тип калькулятора:\u001B[0m\n1 - обычный \t 2 - комплексный\n");
        if (userIntut.equals("1")) {
            this.calculator = new DecoratorRegular(new RegularCalc(), new Logger());
            runInt();
        } else if (userIntut.equals("2")) {
            this.calculator = new DecoratorComplex(new ComplexCalc(), new Logger());
            runComplex();
        }
    }

    /**
     * Метод, запускающий работу обычного калькулятора
     */
    public void runInt() {
        while (true) {
            double[] primaryArg = promptInt("\u001B[32mВведите первый аргумент: \u001B[0m");
            calculator.sum(primaryArg);

            while (true) {
                String cmd = prompt("\u001B[32mВведите команду (*, /, +, - , =) : \u001B[0m");
                if (cmd.equals("*")) {
                    double[] arg = promptInt("\u001B[32mВведите следующий аргумент: \u001B[0m");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    double[] arg = promptInt("\u001B[32mВведите следующий аргумент: \u001B[0m");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("-")) {
                    double[] arg = promptInt("\u001B[32mВведите следующий аргумент: \u001B[0m");
                    calculator.sub(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    double[] arg = promptInt("\u001B[32mВведите следующий аргумент: \u001B[0m");
                    calculator.div(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    double[] result = calculator.getResult();
                    System.out.printf("\u001B[34mРезультат %s\n\u001B[0m", Math.round(result[0] * 1000.0) / 1000.0);
                    break;
                }
            }
            String cmd = prompt("\u001B[31mЕще посчитать (Y/N)?\n\u001B[0m");
            if (cmd.toLowerCase().equals("y")) {
                calculator.setPrimaryArg(new double[2]); // добавил сброс значения primaryArg в 0
                continue;
            }
            break;
        }
    }

    /**
     * Метод, запускающий работу комплексного калькулятора
     */
    public void runComplex() {
        while (true) {
            double[] primaryArg = promptArray("\u001B[32mВведите первый аргумент:\n\u001B[0m");
            calculator.sum(primaryArg);

            while (true) {
                String cmd = prompt("\u001B[32mВведите команду (*, /, +, - , =) : \u001B[0m");
                if (cmd.equals("*")) {
                    double[] arg = promptArray("\u001B[32mВведите следующий аргумент:\n\u001B[0m");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    double[] arg = promptArray("\u001B[32mВведите следующий аргумент:\n\u001B[0m");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("-")) {
                    double[] arg = promptArray("\u001B[32mВведите следующий аргумент:\n\u001B[0m");
                    calculator.sub(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    double[] arg = promptArray("\u001B[32mВведите следующий аргумент:\n\u001B[0m");
                    calculator.div(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    double[] result = calculator.getResult();
                    System.out.printf("\u001B[34mРезультат: %s + %si\n\u001B[0m",
                            Math.round(result[0] * 1000.0) / 1000.0,
                            Math.round(result[1] * 1000.0) / 1000.0); // результат округляю до трех знаков после запятой
                    break;
                }
            }
            String cmd = prompt("\u001B[31mЕще посчитать (Y/N)?\n\u001B[0m");
            if (cmd.toLowerCase().equals("y")) {
                calculator.setPrimaryArg(new double[2]); // добавил сброс значения primaryArg в 0
                continue;
            }
            break;
        }
    }

    /**
     * Выводит сообщение с запросом ввести данные типа String. Принимает данные от
     * пользователя и возвращает их
     * 
     * @param message текст сообщения
     * @return введенные пользователем данные (String)
     */
    private String prompt(String message) {
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * Выводит сообщение с запросом ввести данные типа Double. Принимает одно
     * значение от пользователя и возвращает его
     * 
     * @param message текст сообщения
     * @return введенные пользователем данные (возвращается double[]. веденное число
     *         хранится в [0] ячейке)
     */
    private double[] promptInt(String message) {
        double[] arr = new double[1];
        System.out.print(message);
        arr[0] = Double.parseDouble(in.nextLine());
        return arr;
    }

    /**
     * Выводит сообщение с запросом ввести данные типа Double. Принимает два
     * значения от пользователя и возвращает их
     * 
     * @param message текст сообщения
     * @return введенные пользователем данные (возвращается double[]. вещественная
     *         часть хранится в [0] ячейке, мнимая часть хранится в [1] ячейке)
     */
    private double[] promptArray(String message) {
        double[] arr = new double[2];
        System.out.print(message);
        System.out.print("Введите вещественную часть: ");
        arr[0] = Double.parseDouble(in.nextLine());
        System.out.print("Введите мнимую часть: ");
        arr[1] = Double.parseDouble(in.nextLine());
        return arr;
    }
}