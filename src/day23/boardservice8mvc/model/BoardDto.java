package day23.BoardDtoservice8mvc.model;

public class BoardDto {
    private String content;
    private String writer;
    private int pwd;
    // private 다른 클래스에서 접근을 차단하는 키워드, 즉 현재 클래스에서만 사용 가능
    // 왜 ? 외부로부터 지정한 필드의 직접접근을 차단하기 위해
    //2. 생성자(객체초기화함수) : 객체생성시 new 뒤로 오는 함수
    // 생성자는 클래스명과 이름이 동일해야한다. 동일하지 않으면 함수로 취급된다.
    // - 생성자는 매개변수(함수안으로 들어오는 값을 저장하는 변수)가 있지만 반환값(함수가 종료될 때 반환하는 값)이 없다
    // 오버로딩 : 동일한 함수명/생성자명 으로 선언은 불가능 하지만 매개변수의 타입,개수,순서 에 따라 식별 가능한 함수 선언 방법

    //2-1 매개변수 1개 존재하는 생성자
    BoardDto(){ }
    //2-2 매개변수 1개 존재하는 생성자
    public BoardDto(String content) {
        this.content = content;
    }
    //2-3 매개변수 2개 존재하는 생성자
    public BoardDto(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
    //2-2 매개변수 전체 존재하는 생성자
    public BoardDto(String content, String writer, int pwd) {
        this.content = content;
        this.writer = writer;
        this.pwd = pwd;
    }
    //3. 메소드(멤버함수)
    // - getter함수 (필드값 호출함수)
    // - setter함수 (필드값 저장함수)
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

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }
    // -toString : Object 객체 ( 자바의 최상위 클래스 ) 의 메서드
    //재정의 : Object 클래스내 toString 함수를 재정의한다.
    // 원래 toString()함수는 객체의 주소값을 반환하는 함수인데.
    // 주소값 대신 객체의 필드정보를 출력하기 위해 재정의한다.
    @Override
    public String toString() {
        return "BoardDto{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}
