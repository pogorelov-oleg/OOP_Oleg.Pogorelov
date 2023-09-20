package Models.Calculators;

import Models.Logger;

import Models.Interfaces.iCalculable;

/**
 * Decorator для подключения логгера (Logger) к комплексному калькулятору (ComplexCalc)
 */
public class DecoratorComplex implements iCalculable {

    private iCalculable oldCalculator;
    private Logger logger;

    public DecoratorComplex(iCalculable oldCalculator, Logger logger) {
        this.oldCalculator = oldCalculator;
        this.logger = logger;
    }

    @Override
    public iCalculable sum(double[] arg) {
        double[] primaryArg = oldCalculator.getResult();
        logger.log(
                String.format(
                        "\u001B[33mПервое значение калькулятора: %s + %si. Начало вызова метода sum с параметром: %s + %si\u001B[0m",
                        primaryArg[0], primaryArg[1], primaryArg[0], primaryArg[1]));
        iCalculable result = oldCalculator.sum(arg);
        logger.log(String.format("\u001B[33mВызов метода sum произошел\u001B[0m"));

        return result;
    }

    @Override
    public iCalculable multi(double[] arg) {
        double[] primaryArg = oldCalculator.getResult();
        logger.log(String.format(
                "\u001B[33mПервое значение калькулятора: %s + %si. Начало вызова метода multi с параметром: %s + %si\u001B[0m",
                primaryArg[0], primaryArg[1], primaryArg[0], primaryArg[1]));
        iCalculable result = oldCalculator.multi(arg);
        logger.log(String.format("\u001B[33mВызов метода multi произошел\u001B[0m"));

        return result;
    }

    @Override
    public iCalculable sub(double[] arg) {
        double[] primaryArg = oldCalculator.getResult();
        logger.log(
                String.format(
                        "\u001B[33mПервое значение калькулятора: %s + %si. Начало вызова метода sub с параметром: %s + %si\u001B[0m",
                        primaryArg[0], primaryArg[1], primaryArg[0], primaryArg[1]));
        iCalculable result = oldCalculator.sub(arg);
        logger.log(String.format("\u001B[33mВызов метода sub произошел\u001B[0m"));

        return result;
    }

    @Override
    public iCalculable div(double[] arg) {
        double[] primaryArg = oldCalculator.getResult();
        logger.log(
                String.format(
                        "\u001B[33mПервое значение калькулятора: %s + %si. Начало вызова метода div с параметром: %s + %si\u001B[0m",
                        primaryArg[0], primaryArg[1], primaryArg[0], primaryArg[1]));
        iCalculable result = oldCalculator.div(arg);
        logger.log(String.format("\u001B[33mВызов метода div произошел\u001B[0m"));

        return result;
    }

    @Override
    public double[] getResult() {
        double[] result = oldCalculator.getResult();
        logger.log(String.format("\u001B[33mПолучение результата: %s + %si\u001B[0m", result[0], result[1]));

        return result;
    }

    @Override
    public iCalculable setPrimaryArg(double[] primaryArg) {
        iCalculable result = oldCalculator.setPrimaryArg(primaryArg);

        return result;
    }

}