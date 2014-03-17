package ein.pack;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println("Ein Test");
    CommonUtils.getText("ZZZZ");
    TestUtils.printText("Hallo");
    doNothing();
  }

  private static void doNothing()
  {
    try
    {
      Thread.sleep(500);
    } catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }
}
