import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opr1, opr2, choice, result;
        boolean isTryAgain = false;
        do {
            isTryAgain = false;
            choice = -1;
            System.out.println("Calculator : Enter Your Choice...");
            System.out.println("1.) Addition, + ");
            System.out.println("2.) Subtraction, - ");
            System.out.println("3.) Multiplication, * ");
            System.out.println("4.) Division, / ");

            System.out.println("Enter Your Choice:");
            choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter First Operand :");
                    opr1 = sc.nextInt();

                    System.out.println("Enter Second Operand :");
                    opr2 = sc.nextInt();

                    result = opr1 + opr2;
                    System.out.println(opr1 + " + " + opr2 + " = " + result);
                    // choice = -1;
                    isTryAgain = wantTryAgain();

                    break;
                case 2:
                    System.out.println("Enter First Operand :");
                    opr1 = sc.nextInt();

                    System.out.println("Enter Second Operand :");
                    opr2 = sc.nextInt();

                    result = opr1 - opr2;
                    System.out.println(opr1 + " - " + opr2 + " = " + result);
                    // choice = -1;
                    isTryAgain = wantTryAgain();
                    break;
                case 3:
                    System.out.println("Enter First Operand :");
                    opr1 = sc.nextInt();

                    System.out.println("Enter Second Operand :");
                    opr2 = sc.nextInt();

                    result = opr1 * opr2;
                    System.out.println(opr1 + " * " + opr2 + " = " + result);
                    // choice = -1;
                    isTryAgain = wantTryAgain();

                    break;
                case 4:
                    System.out.println("Enter First Operand :");
                    opr1 = sc.nextInt();

                    System.out.println("Enter Second Operand :");
                    opr2 = sc.nextInt();
                    if (opr2 == 0) {
                        System.out.println("Invalid Input...Divisor Cant be zero");
                    } else {
                        result = opr1 / opr2;
                        System.out.println(opr1 + " / " + opr2 + " = " + result);
                    }

                    isTryAgain = wantTryAgain();
                    break;
                default:
                    choice = -1;

                    break;
            }
        } while (isRestart(choice, isTryAgain));
    }

    public static boolean isRestart(int num, boolean isTryAgain) {

        // return ((num <= 4 && num >= 1) && isTryAgain) || (!(num <= 4 && num >= 1) &&
        // isTryAgain)
        // || (!(num <= 4 && num >= 1) && !isTryAgain);
        return (!(num <= 4 && num >= 1) || isTryAgain);
    }

    public static boolean wantTryAgain() {
        Scanner sc2 = new Scanner(System.in);
        int ch;
        System.out.println("Do You Want To try again(0/1)..(0 => No / 1 => Yes )");
        ch = sc2.nextInt();
        return ch == 1 ? true : false;

    }

    // public static int takeInput() {
    // Scanner sc3 = new Scanner(System.in);
    // int opr1;
    // System.out.println("Enter First Operand :");
    // opr1 = sc3.nextInt();
    // return opr1;

    // }

}
