package pkg1;

public class Scope_of_Var
{
	int num1, num2;   //Instance Variables
    static int result;  //Class Variable
    int add(int a, int b){  //Local Variables
        num1 = a;
        num2 = b;
        return a+b;
    }
    public static void main(String args[]){
        Scope_of_Var ob = new Scope_of_Var();
        result = ob.add(10, 20);
        System.out.println("Sum = " + result);
        result=result+5;
        System.out.println("new="+result);
    }

}
