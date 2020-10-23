import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        String[] a = { "$", "EUR" };
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter money amount: ");
        String money = sc.nextLine();
        Boolean d = money.substring(0, 1).equals(a[0]);
        if (d == true) {
            double dollar = Double.parseDouble(money.substring(1));
            dollar = dollar * 23500;
            System.out.println(money + " = " + dollar + " VND ");
        }

        boolean e = money.substring(money.length() - 3).equals(a[1]);
        double euro = Double.parseDouble(money.substring(0));
        if (e == true) {
            int m = money.length() - 4;
            int n = Integer.parseInt(money.substring(0, m));
            euro = euro * 27100;
            System.out.println(money + " = " + euro + " VND ");

        }
    }
}
