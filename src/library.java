interface libraryuser {
    public abstract void registeraccount();
    public abstract void requestbook();
}
class kidUsers implements libraryuser
{
    public void registeraccount()
    {
        System.out.println("kidusers register account");
    }
    public void requestbook()
    {
        System.out.println("kidusers requestbook");
    }
}
class Adultuser implements libraryuser
{
    public void registeraccount()
    {
        System.out.println("Adultuser register account");
    }
    public void requestbook()
    {
        System.out.println("Adultuser requestbook");
    }
}
class library
{
    public static void main(String[] args) {
        kidUsers l = new kidUsers();
        l.registeraccount();
        l.requestbook();
        Adultuser d = new Adultuser();
        d.registeraccount();
        d.requestbook();
    }
}
