package bitcamp.util;

public class StudentSelector {
  public static void main(String[] args) throws Exception {
    String[] names = {
     "봉", "주", "신"
    };

    int count = (int) (Math.random() * 100 + 1);
    for (int i = 0; i < count; i++) {
      Math.random();
      System.out.print(".");
      Thread.sleep(200);
    }
    System.out.println();

    int selectedIndex = (int)(Math.random() * names.length);
    System.out.println("축 당첨!");
    Thread.sleep(3000);
    System.out.println(names[selectedIndex]);
    
     
  }
}
