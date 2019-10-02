import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation(){}
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return this.b * this.b - 4 * this.a * this.c;
    }
    public double getRoot1(){
        return (-this.b + Math.sqrt(this.b * this.b - 4 * this.a * this.c))/2*a;
    }
    public double getRoot2(){
        return (-this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c))/2*a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = scanner.nextDouble();
        System.out.println("Enter b : ");
        double b = scanner.nextDouble();
        System.out.println("Enter c : ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();
        if (delta > 0) System.out.println("The equation has two roots " + root1 + " and " + root2);
        if (delta == 0) System.out.println("The equation has one root " + root1);
        if (delta < 0) System.out.println("The equation has no real roots ");
    }
}
