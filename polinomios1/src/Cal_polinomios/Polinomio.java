package Cal_polinomios;

public class Polinomio {
    private double[] numeradorbase;
    
    public Polinomio(double[] numeradorbase) {
        this.numeradorbase = numeradorbase;
    }
    
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < numeradorbase.length; i++) {
            result += numeradorbase[i] * Math.pow(x, i);
        }
        return result;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = numeradorbase.length - 1; i >= 0; i--) {
            if (numeradorbase[i] != 0) {
                if (sb.length() > 0 && numeradorbase[i] > 0) {
                    sb.append(" + ");
                }
                sb.append(numeradorbase[i]).append("x^").append(i);
            }
        }
        return sb.toString();
    } 
}
