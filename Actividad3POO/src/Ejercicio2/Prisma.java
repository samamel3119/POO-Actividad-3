package Ejercicio2;

public class Prisma {
    double base;
    double altura;
    public Prisma(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double calcularVolumen() {
        return (base * base) * altura;
    }
    public double calcularSuperficie() {
        return (2 * base * base) + (4 * base * altura);
    }
}