public class Ex_03_ISP {

    public interface ShapeArea { // интерфейс для вычисления площади
        double area();
    }
     public interface ShapeVolume { // интерфейс для вычисления объема
        double volume();
    }

    public class Circle implements ShapeArea { // класс для создания и работы с кругом
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return 2 * 3.14 * radius;
        }
    }

    public class Cube implements ShapeArea, ShapeVolume { // класс для создания и работы с кубом
        private int edge;

        public Cube(int edge) {
            this.edge = edge;
        }

        @Override
        public double area() {
            return 6 * edge * edge;
        }

        @Override
        public double volume() {
            return edge * edge * edge;
        }
    }

}
