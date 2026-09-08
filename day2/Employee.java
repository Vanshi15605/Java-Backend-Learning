class Employee{
    private String name;
    private double salary;
    private int id;

    static String companyName="XYZ";
    static int employeeCount=0;

    Employee(String name,double salary,int id)
    {
        this.name=name;
        this.salary=salary;
        this.id=id;
        employeeCount++;
    }

    String getname()
    {
        return this.name;
    }

    void setname(String name)
    {
        this.name=name;
    }
    
    double getsalary()
    {
        return this.salary;
    }

     void setsalary(double salary)
    {
        if(salary>0)
        this.salary=salary;
    }

    int getid()
    {
        return this.id;
    }
    void setid(int id)
    {
        this.id=id;
    }
    


    void displayDetails()
    {
        System.out.println("Employee name is "+getname());
        System.out.println("Employee id is "+getid());
        System.out.println("Employee salary is "+getsalary());
        System.out.println("Company name is "+Employee.companyName);
        System.out.println("Company employee count is "+Employee.employeeCount);

    }

    public static void main(String[] args) {
        Employee e1=new Employee("Amit",23457.90, 345672);
        e1.displayDetails();
         Employee e2=new Employee("anant",27807.90, 345932);
         e2.setid(345642);
        e2.displayDetails();
     
    }
    
}