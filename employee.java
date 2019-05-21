
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Employee
{
private String name;
private int salary;

public void init(String n,int sal){
    name = n;
    salary = sal;
    
}
public void setSalary(int sal){
    salary=sal;
    
}
public void getSalary(){
    return salary;
    
}
public void print(){
    System.out.println(name);
    System.out.println(salary);
}
}
