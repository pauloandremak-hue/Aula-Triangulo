/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulatriangulo;

/**
 *
 * @author glbra
 */
public class Triangulo {
    private double h;
    private double c1; 
    private double c2;
    private double area;
    
    public Triangulo(){
        c1 = 0;
        c2 = 0;
        h = 0;
        area = 0;
    }
    public Triangulo(double h, double c1, double c2, double area){
        this.c1 = c1;
        this.c2 = c2;
        this.h = h;
        this.area = area;
        
    }
    
    public double calculaArea(){
        this.area = (this.c1*this.c2) / 2.0;
        return area;
    }
    
    public double calculahipotenusa(){
        double quadrado1, quadrado2;
        double soma;
        
        quadrado1 = Math.pow(c1, 2);
        quadrado2 = Math.pow(c2, 2);
        soma = quadrado1+quadrado2;
        
        //this.h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        
        this.h = Math.sqrt(soma);
        
        return h;
    }

    /**
     * @return the h
     */
    public double getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(double h) {
        this.h = h;
    }

    /**
     * @return the c1
     */
    public double getC1() {
        return c1;
    }

    /**
     * @param c1 the c1 to set
     */
    public void setC1(double c1) {
        this.c1 = c1;
    }

    /**
     * @return the c2
     */
    public double getC2() {
        return c2;
    }

    /**
     * @param c2 the c2 to set
     */
    public void setC2(double c2) {
        this.c2 = c2;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }
    
    
    
}
