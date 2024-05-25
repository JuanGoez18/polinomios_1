package Cal_polinomios;

public class Main_Polinomios {
    public static void main(String[] args) {
        double[] numeradorbase = {1, 1, 0.05, 0.01};
        Polinomio polinomio1 = new Polinomio(numeradorbase);
        Polinomio polinomio2 = new Polinomio(numeradorbase);

        Cls_trabajador trabajador1 = new Cls_trabajador("Juan Perez", 8, 2, 10, 1,polinomio1);
        Cls_trabajador trabajador2 = new Cls_trabajador("Luis Alfonzo", 6, 0, 6, 0,polinomio1);
        Cls_trabajador trabajador3 = new Cls_trabajador("Maria Alejandra", 7, 3, 10, 1,polinomio1);
        
        System.out.println(trabajador1);
        System.out.println(trabajador2);
        System.out.println(trabajador3);
    }
}
