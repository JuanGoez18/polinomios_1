package Cal_polinomios;

public class Cls_trabajador {
    private String nombre;
    private double horastr;
    private double horasex;
    private double rendimiendo;
    private double competencia;
    private Polinomio mypolinomio;

    public Cls_trabajador(String nombre, double horastr, double horasex, double rendimiendo, double competencia, Polinomio mypolinomio) {
        this.nombre = nombre;
        this.horastr = horastr;
        this.horasex = horasex;
        this.rendimiendo = rendimiendo;
        this.competencia = competencia;
        this.mypolinomio = mypolinomio;
    }
    
    public double calculopago() {
        double pagosbase = horastr * 15;
        double pagosextra = horasex * 20;
        double totalpago = horastr + horasex;
        double subtotal = totalpago * rendimiendo;
        double pagofinal = subtotal + competencia;
        return mypolinomio.evaluate(pagofinal);
    }
    
    @Override
    public String toString() {
        return "Empleados {nombre='" + nombre + "'horas trabajadas = " + horastr + 
                ", horas extras = " + horasex + ", Factor de rendimiento = " + rendimiendo + 
                ", competencia = " + competencia + ", Pago total = " + calculopago() + "}";
    }
}
