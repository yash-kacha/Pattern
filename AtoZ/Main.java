import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Logic2 logic = new Logic2();


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String text = sc.nextLine();


        System.out.print("Enter a Integer : ");
        int size = sc.nextInt();


        System.out.print("Enter a Char : ");
        char ch = sc.next().charAt(0);

        System.out.println("\n\n");
        logic.setCh(ch);
        logic.setSize(size);

        logic.logicOp(text.toUpperCase());
    }
}
