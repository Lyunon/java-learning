package package2; //패키지가 다름

import package1.*;

public class C {
  A a; //(x) A 클래스 접근 불가(컴파일 에러)
  B b; //(o)
}
