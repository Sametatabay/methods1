import java.util.Scanner;
public class Main {
    static boolean isPalindrom(int number) {
        int temp = number, reversNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reversNumber = (reversNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reversNumber) {
            return true;
        } else
            return false;
    }
    public static void main(String[] args) {
        int count;
      Scanner inp =new Scanner(System.in);
      System.out.print("Count Enter :");
      count=inp.nextInt();
      System.out.print(isPalindrom(count));
    }
}
