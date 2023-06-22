// 다형성 - 다형적 변수와 instanceof 연산자
package com.eomcs.oop.ex06.a;

public class Exam0511 {

  public static void main(String[] args) {
    Vehicle v = new Sedan();

    // getClass() ?
    // => 레퍼런스가 가리키는 인스턴스의 실제 클래스 정보를 리턴한다.
    // => == 연산자를 사용하여 특정 클래스의 인스턴스인지 좁혀서 검사할 수 있다.
    //
    // 클래스명.class
    // => 클래스 정보를 갖고 있는 스태틱 변수이다.
    //
    System.out.println(v.getClass() == Sedan.class);
    System.out.println(v.getClass() == Car.class);
    System.out.println(v.getClass() == Vehicle.class);
    System.out.println(v.getClass() == Truck.class);
    System.out.println(v.getClass() == Bike.class);
  }

}
// 클래스정보를 담고 있는  주소를 리턴  그 주소와  스태틱으로 선언언되고  모든 인스턴스드르의 의해 공유 된다. 
// 클래스 정보를 담고 있는 인스턴스를 가ㅣ맄ㄴ다. 
// 세단 클래스 린의 스태닛 변수가 리턴한거랑  비교 




