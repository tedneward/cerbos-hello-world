namespace AppTest;

[TestClass]
public class UnitTest1
{
    [TestMethod]
    public void AppByDefaultShouldShowNothing()
    {
        var app = new App();

        Assert.AreEqual(app.Greeting, "Hello world!");
    }
}