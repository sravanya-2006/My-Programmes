package practice;

class Wrapper1
{
public static void main (String [] args)
{
int a=10;
double b=5.65;
Integer aObj=Integer.valueOf(a);
Double bObj=Double.valueOf(b);
if (aObj instanceof Integer)
System.out.println("Object of integer is created");
if (bObj instanceof Double)
System.out.println("Object of double is created");
}
}
