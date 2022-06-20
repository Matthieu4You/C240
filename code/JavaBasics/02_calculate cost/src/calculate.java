import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        String inputLength;
        String inputWidth;

        Scanner scanner = new Scanner(System.in);
        System.out.println("now we are calculating the cost");

        System.out.println("please enter the length");
        inputLength = scanner.nextLine();

        System.out.println("please enter the width");
        inputWidth = scanner.nextLine();

        float length=Float.parseFloat(inputLength);
        float width=Float.parseFloat(inputWidth);

        float area=length*width;
        float perimeter=2*(length+width);

        float res=3.50f*area+2.25f*perimeter;
        System.out.println("the result is : " + res);

    }
}
