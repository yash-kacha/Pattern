import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Logic logic = new Logic();


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String text = sc.nextLine();


        System.out.print("Enter a Integer : ");
        int size = sc.nextInt();


        System.out.print("Enter a Char : ");
        char ch = sc.next().charAt(0);

        logic.setCh(ch);
        logic.setSize(size);


        logic.logicOp(text.toUpperCase());
    }
}
