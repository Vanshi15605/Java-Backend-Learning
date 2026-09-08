class Book
{
    String title,author;
    double price;
    int pages;

    Book(String title,String author,int pages,double price)
    {
        this.title=title;
        this.author=author;
        this.pages=pages;
        this.price=price;
    }

    void displayDetails()
    {
        System.out.println("\n Book is "+title+" by " + author +" having "+ pages +" pages at price "+price);
    }

    boolean isExpensive()
    {
        if(price>500)              //if price>50    return price>50 
        return true;               //better hai ye approach coz of shorter code
        else
        return false;
    }

    public static void main(String[] args) {
        Book b1=new Book("Too good to be true","Prajakta",567,399.0);
        b1.displayDetails();
        if(b1.isExpensive())
        System.out.println("Book is expensive");
        else
            System.out.println("Book is not expensive");

        Book b2=new Book("Harry Potter","J.K. Rolling",545,567.0);
        b2.displayDetails();
        if(b2.isExpensive())
        System.out.println("Book is expensive");
        else
            System.out.println("Book is not expensive");

        Book b3=new Book("Ikigai","XYZ",356,349.0);
        b3.displayDetails();
        if(b3.isExpensive())
         System.out.println("Book is expensive");
        else
            System.out.println("Book is not expensive");
    }
}