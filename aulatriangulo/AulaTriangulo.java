package aulatriangulo;

// CLASSE PRINCIPAL (O NetBeans vai procurar esta classe para rodar)
public class AulaTriangulo {

    public static void main(String[] args) {
        // Criando os objetos usando a classe que está logo abaixo
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo(2.0, 3.5, 5.6, 0.0);

        t1.setC1(2);
        t2.setC1(4);

        System.out.println("Valor do cateto 1 do t1: " + t1.getC1());
        System.out.println("Valor do cateto 1 do t2: " + t2.getC1());
    }
}

// CLASSE TRIANGULO (Sem a palavra 'public' para o Java aceitar no mesmo arquivo)
class Triangulo {
    private double h;
    private double c1; 
    private double c2;
    private double area;
    
    // Construtor Padrão
    public Triangulo(){
        this.c1 = 0;
        this.c2 = 0;
        this.h = 0;
        this.area = 0;
    }
    
    // Construtor com Parâmetros
    public Triangulo(double h, double c1, double c2, double area){
        this.c1 = c1;
        this.c2 = c2;
        this.h = h;
        this.area = area;
    }
    
    // Getters e Setters fundamentais
    public double getC1() { return c1; }
    public void setC1(double c1) { this.c1 = c1; }
    public double getC2() { return c2; }
    public void setC2(double c2) { this.c2 = c2; }
    public double getH() { return h; }
    public void setH(double h) { this.h = h; }
    public double getArea() { return area; }
    
    public double calculaArea(){
        this.area = (this.c1 * this.c2) / 2.0;
        return this.area;
    }
    
    public double calculahipotenusa(){
        this.h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        return this.h;
    }
}
    
