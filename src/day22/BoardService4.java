
package day22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
수정 조건 - 고정길이가 아닌 가변길이 형식으로 수정하여 100개 아닌 무한개 저장 가능한 가변길이 배열만들기
 */
public class BoardService4 { // 실행클래스
    public static void main(String[] args) {
        // - 입력객체
        Scanner sc = new Scanner(System.in);
        List<Board> boardList = new ArrayList<>();// - 고정길이 - Board 객체 100개를 저장할 수 있는 배열 선언

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

                     //만약에 i 번째 게시물이 비어있으면
                        // -게시물 작성
                        Board board = new Board();
                        board.setContent(contant);
                        board.setWriter(writer);
                        board.setPassword(password);
                        boardList.add(board);

            }else if( choose == 2){
                for (Board board : boardList) {
                    System.out.printf("작성자 : %s , 내용 : %s \n", board.getWriter(),
                            board.getContent());
                }
            }
        }
    }



}
