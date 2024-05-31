package demo.calculator;

public class Calci {
    public int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public int product(int a,int b){
        int pro=a*b;
        return pro;
    }
    public int large(int a,int b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public void findOddOrEven(int a){
        if (a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}