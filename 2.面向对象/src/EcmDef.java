import java.lang.Exception;

public class EcmDef {
    public static void main(String[] args) {
//        System.out.println(Double.parseDouble(args[0]) / Double.parseDouble(args[1]));
        try {
            System.out.println(ecm(Double.parseDouble(args[0]), Double.parseDouble(args[1])));

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }


    static public double ecm(double a, double b) throws NegativeException {
        if(a < 0 || b < 0) {
            throw new NegativeException("has negative number");
        } else if (b == 0) {
            throw new ArithmeticException("divide by 0");
        }

        return a / b;
    }
}

class NegativeException extends Exception {
    static final long serialVersionUID = -33875163124229948L;

    public NegativeException() {
        super();
    }

    public NegativeException(String mes) {
        super(mes);
    }
}