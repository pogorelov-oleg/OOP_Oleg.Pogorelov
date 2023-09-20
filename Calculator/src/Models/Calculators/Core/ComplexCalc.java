package Models.Calculators.Core;

import Models.Interfaces.iCalculable;

/**
 * Описывает работу комплексного калькулятора
 */
public class ComplexCalc implements iCalculable {

    /**
     * Поле хранит значение памяти калькулятора
     */
    private double[] primaryArg;

    /**
     * Конструктор создает пустой массив на 2 элемента и присваевает его переменной primaryArg
     */
    public ComplexCalc() {
        this.primaryArg = new double[2];
    }

    @Override
    public iCalculable sum(double[] args) {
        this.primaryArg[0] += args[0];
        this.primaryArg[1] += args[1];
        return this;

    }

    @Override
    public iCalculable sub(double[] args) {
        this.primaryArg[0] -= args[0];
        this.primaryArg[1] -= args[1];
        return this;

    }

    @Override
    public iCalculable multi(double[] args) {
        this.primaryArg[0] = this.primaryArg[0] * args[0] - this.primaryArg[1] * args[1];
        this.primaryArg[1] = this.primaryArg[1] * args[0] + this.primaryArg[0] * args[1];
        return this;

    }

    @Override
    public iCalculable div(double[] args) {
        this.primaryArg[0] = (this.primaryArg[0] * args[0] + this.primaryArg[1] * args[1])
                / (Math.pow(args[0], 2) + Math.pow(args[1], 2));
        this.primaryArg[1] = (this.primaryArg[1] * args[0] + this.primaryArg[0] * args[1])
                / (Math.pow(args[0], 2) + Math.pow(args[1], 2));
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
    @Override
    public iCalculable setPrimaryArg(double[] primaryArg) {
        this.primaryArg[0] = primaryArg[0];
        this.primaryArg[1] = primaryArg[1];
        return this;
    }
}
