interface libraryuser {
    public abstract void registeraccount(int age);
    public abstract void requestbook(String booktype);
}
class kidUsers implements libraryuser
{
    int age;
    String booktype;
    public void registeraccount(int age)
    {
        if(age<12)
        {
            System.out.println("you have successfully registered");
        }
        else if(age>12)
        {
            System.out.println("Sorry, age must be less than 12 to register as a kid");
        }
    }
    public void requestbook(String booktype)
    {
        if(booktype=="Kids")
            System.out.println("book issued successfully, please return the book within 10 days");
        else
            System.out.println("Oops, you are allowed to take only lids books");

    }
}
class Adultuser implements libraryuser
{
    public void registeraccount(int age)
    {
        if(age>12)
            System.out.println("you have successfully registered");
        else if(age<12)
            System.out.println("Sorry, age is must be graeter than 12 to register as an adult user");
    }
    public void requestbook(String booktype)
    {
        if(booktype=="Fiction")
            System.out.println("Book Issued successfully, please return book within 7 days");
        else
            System.out.println("Oops, you are allowed to take only adult Fiction books");
    }
}
class libraryinterfaceDemo
{
    public static void main(String[] args) {
        kidUsers l = new kidUsers();
        l.registeraccount(10);
        l.registeraccount(18);
        l.requestbook("Kids");
        l.requestbook("Fiction");
        Adultuser d = new Adultuser();
        d.registeraccount(5);
        d.registeraccount(23);
        d.requestbook("Fiction");
        d.requestbook("Kids");
    }
}
