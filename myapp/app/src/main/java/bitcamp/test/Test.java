package bitcamp.test;

public class Test {
  
  public static void main(String[] args) {
    Calculator c  = new Calculator2();
    
//    Calculator2 c2 = (Calculator2) c; 뿡치지마라 
    
    System.out.println(((Calculator2)c).minus(100,200));
    System.out.println(((Calculator)c).plus(100,200)); 
  }
}
// 어떤 자바 클래스도 object의 자손이라 볼 수 있는거지 