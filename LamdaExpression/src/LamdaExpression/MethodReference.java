package LamdaExpression;

//defined a functional interface and referring a static method to it's functional method say().



interface Sayable3{  
    void say();  
}  
public class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable3 sayable = MethodReference::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  