package LamdaExpression;

//Java Lambda Expression Example: No Parameter

interface Sayable{  
    public String say();  
}  
public class Lamda1{  
public static void main(String[] args) {  
    Sayable s=()->{  
        return "I have nothing to say.";  
    };  
    System.out.println(s.say());  
}  
}  