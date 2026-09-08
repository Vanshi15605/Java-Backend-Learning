class Box<T>
{
    T value;


    void setValue(T value)
    {
        this.value=value;
    }


    T getValue()
    {
        return value;
    }


    public static void main(String[] args) {

        //box1 integer
        Box<Integer> b1=new Box<>();
        b1.setValue(123);
        System.out.println(b1.getValue());


        //box2 string
        Box<String> b2=new Box<>();
        b2.setValue("Hellllllloooo babydolll");
        System.out.println(b2.getValue());

    }
}