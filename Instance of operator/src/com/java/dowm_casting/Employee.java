package com.java.dowm_casting;

public class Employee extends Company {
    public void check() {
        System.out.println("Success.");
    }

  /* 
   * 
   *  
   *  public static void view(Company c) {
        if (c instanceof Employee) {
            Employee b1 = (Employee) c;
            b1.check();
        }
    }
*/
    public static void main(String[] args) {
        Company c = new Employee();
        Employee.view(c);
        
        // comment
        
    }
}
