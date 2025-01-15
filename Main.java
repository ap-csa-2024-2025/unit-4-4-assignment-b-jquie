import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Write two strings:");
    String sentence = sc.nextLine();
    String target = sc.nextLine();
    int index = sentence.indexOf(target);
    if (index != 0)
    {
      String answer = sentence.substring(0, index) + sentence.substring(index + target.length());
      System.out.println(answer);
    }
    else
    {
      System.out.println("Substring not found.");
    }
  }

  public static int countSub(String word, String target)
  {
    return 0;
  }

  public static int countProperContains(String word, String target)
  {
    return 0;
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
