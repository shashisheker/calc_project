class clac_project{
 public int add(int a ,int b)
 {
int c=a+b;
return c;
 }
 public int  square(int x)
 {
	 int z=x^x;
	 return z;
 }
public static void main(String args[]){
Calculatour cal = new  Calcutor();
System.out.println("The sum of two number is "+(cal.add(2,3)));
  System.out.println("The sum of two number is "+(cal.square(4));
}
}
