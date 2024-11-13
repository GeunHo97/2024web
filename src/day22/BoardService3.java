/*
- 내용[String 타입] 과 작성자[String타입] 과 비밀번호[int타입] 로 구성된 게시물 클래스를 설계 
- 게시물 객체 최대 100개 까지 저장하는 서비스 구축
-조건 : main함수 1개와 배열은 최대1개까지 사용
-구축 : 게시물 쓰기와 게시물 출력 기능구현

타입 : 데이터 형태를 분류
    대분류 : -기본타입(byte,int,short,long,float,double,char,boolean)8개,
            -참조타입( []배열, class클래스, interface인터페이스, 열거타입) 등등
클래스 : 멤버변수(필드), 생성자, 메소드(멤버함수) 로 구성된 새로운 타입 만들기
    - 객체지향 프로그래밍 매우 중요한 문법
객체 : 물리적 / 논리적 으로 정의(특성, 행위)가 가능한 형태물 , 예) 의자, 안경, 책, 강의(논리)
      참조 타입으로 생성된 메모리 공간
      하나의 자료(여러개 자료들의 주소값)를 저장하는 메모리 공간 ( JVM 힙영역 )
      
변수 : 하나의 자료(실제값, 주소값)를 저장하는 메모리 공간 ( JVM 스택영역 )
      기본/참조 타입으로 생선된 메모리 공간
 */
package day22;

import java.util.Scanner;

public class BoardService3 { // 실행클래스
    public static void main(String[] args) {
        // - 입력객체
        Scanner sc = new Scanner(System.in);
        Board[] boardList = new Board[100];// - 고정길이 - Board 객체 100개를 저장할 수 있는 배열 선언
        
        while (true){
            System.out.print("1. 글쓰기 2.글출력");
            int choose = sc.nextInt();
            if (choose == 1){
                // - 사용자로부터 입력을 받는부분
                sc.nextLine(); // 의미없는 nextLine() 코드 작성한다.
                System.out.print("내용 : "); String contant = sc.nextLine();
                // .next() 문자열(공백X) 입력, nextLine() 문자열(공백/띄어쓰기 포함) 입력
                // .nextLine() 사용시 주의할점 : .nextLine() 앞에 또 다른 .nextXX() 존재하면 의미없는
                // .nextLine() 작성해준다
                System.out.print("작성자 : "); String writer = sc.next();
                System.out.print("비밀번호 : "); int password = sc.nextInt();
                // [2] 배열내 빈 공간을 찾아서 게시물 작성하기,
                for (int i = 0; i <= boardList.length-1; i++){
                    if (boardList[i] == null){ //만약에 i 번째 게시물이 비어있으면
                        // -게시물 작성
                        Board board = new Board();
                        board.setContent(contant);
                        board.setWriter(writer);
                        board.setPassword(password);
                        boardList[i] = board;
                        break;
                    }
                }

            }else if( choose == 2){
                for (int i = 0; i <= boardList.length-1; i++){
                    if (boardList[i] != null){
                        System.out.printf("작성자 : %s , 내용 : %s \n",boardList[i].getWriter(),boardList[i].getContent());
                    }
                }
            }
        }
    }
   
    
    
}
