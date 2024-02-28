import java.util.Scanner;
public class Acceptcount 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();
scanner.close();
int count = 0;
System.out.print("Factors of " + number + ": ");
for (int i = 1; i <= number; ++i) 
{
if (number % i == 0) 
{
++count;
System.out.print(i + " ");
}
}
System.out.println("\nTotal factors: " + count);
}
}
