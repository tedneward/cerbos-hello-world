class User
{
    public string username;
    public string role;
}

public class App
{
    private string greeting = "Hello world!";
    User user = new User() { username = "nobody", role="nothing" };

    public App()
    {
    }

    public string Greeting
    {
        get
        {
            return greeting;
        }
        set
        {
            greeting = value;
        }
    }

    public static void Main(string[] args)
    {
        var app = new App();

        
    }
}
