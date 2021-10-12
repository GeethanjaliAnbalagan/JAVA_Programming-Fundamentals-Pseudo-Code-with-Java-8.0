package LamdaExpression;

//Without Lambda Expression

/*
 //Without Lambda Expression
 interface Drawable{  
    public void draw();  
}  
public class Lamda{  
    public static void main(String[] args) {  
        int width=10;  
  
        //without lambda, Drawable implementation using anonymous class  
        Drawable d=new Drawable(){  
            public void draw(){
            System.out.println("Drawing "+width);}  
        };  
        d.draw();  
    }  
}  

*/

//Java Lambda Expression
 
@FunctionalInterface  //It is optional  
interface Drawable{  
    public void draw();  
}  
  
public class Lamda {  
    public static void main(String[] args) {  
        int width=10;  
          
        //with lambda  
        Drawable d2=()->{     
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
    }  
} 
