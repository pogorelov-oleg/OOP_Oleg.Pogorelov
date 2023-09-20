package Models.Calculators.Core;

import Models.Interfaces.iCalculable;

/**
 * Описывает работу обычного калькулятора
 */
public class RegularCalc implements iCalculable {

    /**
     * Поле хранит значение памяти калькулятора
     */
    private double[] primaryArg;

    /**
     * Конструктор создает пустой массив на 1 элемент и присваевает его переменной primaryArg
     */
    public RegularCalc() {
        this.primaryArg = new double[1];
    }

    @Override
    public iCalculable sum(double[] arg) {
        this.primaryArg[0] += arg[0];
        return this;
    }

    @Override
    public iCalculable multi(double[] arg) {
        this.primaryArg[0] *= arg[0];
        return this;
    }

    @Override
    public iCalculable sub(double[] arg) {
        this.primaryArg[0] -= arg[0];
        return this;
    }

    @Override
    public iCalculable div(double[] arg) {
        this.primaryArg[0] /= arg[0];
        return this;
    }

    /**
     * @return возвращает текущее значение primaryArg
     */
    @Override
    public double[] getResult() {

        return this.primaryArg;

    }

    /**
     * выставляет дефолтное значение primaryArg
     */
    public iCalculable setPrimaryArg(double[] primaryArg) {
        this.primaryArg[0] = primaryArg[0];
        return this;
    }

}