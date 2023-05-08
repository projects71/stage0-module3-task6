package lang.print.gaps.task6;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int first = 1;
        int second = 2;
        int eight = 6 + first * second;
        System.out.println(eight);//eight is expected to be 8
        boolean firstBool = false;
        boolean secondBool = false;
        boolean thirdBool = true;
        boolean fourthBool = true;
        int varSix = 17;
        boolean check = false;
        varSix = 5;
        System.out.println(check);
        System.out.println(varSix);
    }
}
