 class InvalidMarksException extends Exception{
    public InvalidMarksException(String message)
    {
        super(message);
    }
 }
class CheckMarks{
public void check(int marks)throws InvalidMarksException {
    if(marks<0 || marks>100)
    {
        throw new InvalidMarksException("You have invalid marks");
    }
}
}

class Student{
    public static void main(String[] args) {
        CheckMarks Student1=new CheckMarks();
        try{
        Student1.check(101);
    }
    catch(InvalidMarksException e){
        System.out.println(e.getMessage());
    }
    finally
    {
        System.out.println("Checked");
    }
}
}