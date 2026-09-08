abstract class Employee
{
    String name;
    double salary;
    Employee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }

    void display()
    {
        System.out.println("Name :"+this.name);
        System.out.println("Salary :"+this.salary);
    }

    abstract double calculateBonus();
}

class Manager extends Employee
{
 double calculateBonus()
 {
    return this.salary/10;
 }
}

class Developer extends Employee
{
 double calculateBonus()
 {
    return this.salary/10;
 }
}



class Main
{
    public static void main(String[] args) {
        
    }
}