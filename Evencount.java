public class Evencount
{
public static void main(String[] args) 
{
int a = 0;
for (int i = 2; i <= 100; i += 2) 
{
System.out.println(i);
a++;
}
System.out.println("Count: " + a);
}
}
