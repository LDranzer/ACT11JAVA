public class Square implements Shape {
    @Override
    public double getArea(double base, double altura) {
        double areaSquare = base*altura;
        return areaSquare;
    }

    @Override
    public double getPerimeter(double lado1, double lado2) {
        double perimSquare = lado1+lado2+lado1+lado2;
        return perimSquare;
    }
}
