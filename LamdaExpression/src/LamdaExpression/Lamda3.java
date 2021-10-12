package LamdaExpression;

//Java Lambda Expression Example: Multiple Parameters

interface Addable{  
    int add(int a,int b);  
}  
  
public class Lamda3{  
    public static void main(String[] args) {  
          
        // Multiple parameters in lambda expression  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Multiple parameters with data type in lambda expression  
        Addable ad2=(int a,int b)->(a+b);  
        System.out.println(ad2.add(100,200));  
    }  
}  