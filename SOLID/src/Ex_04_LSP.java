public class Ex_04_LSP {

    // Я решил убрать наследование квадрата у прямоугольника, так как посчитал их
    // все же разными фигурами с разным поведением. Геттеры и сеттеры у них
    // соответственно тоже должны быть разными. В противном случае, изменяя длину
    // или ширину у фигуры, я мог бы заменить ее и у квадрата (но в таком случае
    // квадрат перестанет быть квадратом). Поэтому решил сделать абстрактный класс,
    // который может быть родителем для любой фигуры. А уж параметры и алгоритм
    // работы метода area у каждого дочернего класса будет свой. Это даст
    // возможность создавать дочерние классы с другими фигурами, с другими параметрами и рассчетами
    // площади.

    /**
     * Абстрактный класс родитель для геометрической фигуры
     */
    public abstract class GeometricFigure {
        
        /**
         * абстрактный метод для рассчета площади фигуры
         * @return возвращает площадь фигуры
         */
        abstract public int area();
    }

    /**
     * Наследник класса GeometricFigure. Работает с прямоугольниками
     */
    public class Rectangle extends GeometricFigure {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public int area() {
            return this.width * this.height;
        }
    }

    /**
     * Наследник класса GeometricFigure. Работает с квадратами
     */
    public class Square extends GeometricFigure {
        private int side;

        public Square(int side) {
            this.side = side;
        }

        public int getSide() {
            return side;
        }

        public void setSide(int side) {
            this.side = side;
        }

        @Override
        public int area() {
            return this.side * this.side;
        }
    }
}
