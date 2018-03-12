/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 *
 * @author Estudiantes
 */
public class Cuadrado extends FiguraGeometrica {

    private int lado,area,perimetro;
       @Override
    int calcularArea() {
        area=lado*lado;
        return area;
        }

    @Override
    int calcularPerimetro() {
        perimetro=lado*4;
        return perimetro;
                
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }
    
}
