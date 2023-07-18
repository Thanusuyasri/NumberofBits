import java.util.Scanner;

public class NumberBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        while(number>0)
        {
            int temp=number%2;
            if(temp==1)
            {
                count++;
            }
            number/=2;
        }
        System.out.println(count);
    }
}
