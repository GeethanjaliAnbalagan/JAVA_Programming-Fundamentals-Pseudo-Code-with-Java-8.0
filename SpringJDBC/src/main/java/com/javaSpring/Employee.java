package com.javaSpring;

import java.io.Serializable;

public class Employee implements Serializable 
{
    private static final long serialVersionUID = -1280037900360314186L;

    private int id;
    private String name;
    private int age;
    private String dept;
    
    public Employee()
    {
        super();
    }

    public Employee(int id, String name, int age, String dept)
    {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
    
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public String getDept()
    {
        return dept;
    }
    public void setDept(String dept)
    {
        this.dept = dept;
    }
    @Override
    public String toString()
    {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + "]";
    }
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((dept == null) ? 0 : dept.hashCode());
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (age != other.age)
            return false;
        if (dept == null)
        {
            if (other.dept != null)
                return false;
        } else if (!dept.equals(other.dept))
            return false;
        if (id != other.id)
            return false;
        if (name == null)
        {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}