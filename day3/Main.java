class Employee
{
private String name;
private int id;
private double salary;

Employee(String name,int id,double salary)
{
    this.name=name;
    this.id=id;
    this.salary=salary;

}

String getName()
{
    return this.name;
}

int getId()
{
    return this.id;
}

double getSalary()
{
    return this.salary;
}

void displayDetails()
{
    System.out.println("Name " +getName());
    System.out.println("Salary " +getSalary());
    System.out.println("Id " +getId());

}

void work()
{
    System.out.println("Employee doees work");
}
}

class Developer extends Employee
{
String language;

Developer(String name,int id,double salary,String language)
{
    super(name, id, salary);
    this.language=language;
}

@Override
void work()
{
    System.out.println("Developing backend");
}

@Override
    void displayDetails()
    {
        super.displayDetails();
        System.out.println("Language "+language);
    }

}

class Manager extends Employee
{
    int teamSize;
    Manager(String name,int id,double salary,int teamSize)
    {
    super(name, id, salary);
    this.teamSize=teamSize;
    }
    
    @Override
    void work()
    {
        System.out.println("Managing Team");
    }

    @Override
    void displayDetails()
    {
        super.displayDetails();
        System.out.println("Team Size "+teamSize);
    }
}

class Main{
    public static void main(String[] args) {
        Developer dp=new Developer("Amit",23,1346.26,"Java");
        dp.displayDetails();
        dp.work();

        System.out.println();

        Manager mp=new Manager("Namitaa",90,13460865.26,40);
        mp.displayDetails();
        mp.work();


    }

}