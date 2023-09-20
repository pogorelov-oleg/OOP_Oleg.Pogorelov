package Models.Interfaces;

public interface iCalculable {
    iCalculable sum(double[] arg);

    iCalculable multi(double[] arg);

    iCalculable sub(double[] arg);

    iCalculable div(double[] arg);

    /**
     * выставляет дефолтное значение primaryArg
     */
    iCalculable setPrimaryArg(double[] primaryArg);

    /**
     * @return возвращает текущее значение primaryArg
     */
    double[] getResult();
}