package aulatriangulo;

public class AulaTriangulo {

    public static void main(String[] args) {

        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo(2.0, 3.5, 5.6, 0.0);

        t1.setC1(2);
        t1.setC2(4);

        t2.setC1(4);

        System.out.println("Valor do cateto 1 do t1: " + t1.getC1());
        System.out.println("Valor do cateto 1 do t2: " + t2.getC1());

        
        System.out.println("Area do t1: " + t1.calculaArea());
        System.out.println("Hipotenusa do t1: " + t1.calculahipotenusa());

        
        System.out.println("Area do t2: " + t2.calculaArea());
        System.out.println("Hipotenusa do t2: " + t2.calculahipotenusa());
    }
}


class Triangulo {
    private double h;
    private double c1;
    private double c2;
    private double area;

    public Triangulo() {
        this.c1 = 0;
        this.c2 = 0;
        this.h = 0;
        this.area = 0;
    }

    public Triangulo(double h, double c1, double c2, double area) {
        this.c1 = c1;
        this.c2 = c2;
        this.h = h;
        this.area = area;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getArea() {
        return area;
    }

    public double calculaArea() {
        this.area = (this.c1 * this.c2) / 2.0;
        return this.area;
    }

    public double calculahipotenusa() {
        this.h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        return this.h;
    }
}
