package day22;

/*
클래스 사용처
1. main함수를 갖는 실행 클래스, 프로젝트당 1개
2. 객체를 생성하기 위한 설계 클래스
 */
public class Board { /* 게시물 타입 클래스 */
    /*
    - 클래스 구성 멤버
    1. 멤버변수( 필드 )
    2. 생성자( 객체초기화 )
    3. 메소드( 멤버함수 )
     */
   private String content; // -- 내용
   private String writer; // -- 작성자
   private int password; // -- 비밀번호

    @Override
    public String toString() {
        return "Content{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", password=" + password +
                '}';
    }

    public Board() {
    }

    public Board(String content, String writer, int password) {
        this.content = content;
        this.writer = writer;
        this.password = password;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
