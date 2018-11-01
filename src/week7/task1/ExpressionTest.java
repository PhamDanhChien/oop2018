package week7.task1;

public class ExpressionTest {

    public static void main(String[] args) {
        Numeral so0 = new Numeral();
        Numeral so1 = new Numeral(1);
        Numeral so2 = new Numeral(2);
        Numeral so3 = new Numeral(3);
        Numeral so10 = new Numeral(10);

        Square sp = new Square(so10);
        Multiplication mu = new Multiplication(so2, so3);
        Subtraction su = new Subtraction(sp, so1);
        Addition di = new Addition(su, mu);
        Square ketqua = new Square(di);


        System.out.println("ket qua cua: (" + so10.evaluate() + "^2 - " + so1.evaluate() + " + " +
                so2.evaluate() + "*" + so3.evaluate() + ")^2 la: " + ketqua.evaluate() );


        try {
            Division er = new Division(so10, so0);
            int chien = er.evaluate();
        }
        catch(ArithmeticException loi){
            System.out.println("da co loi: " + loi.getMessage());
        }

    }

}
