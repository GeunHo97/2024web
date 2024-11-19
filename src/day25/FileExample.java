package day25;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileExample {
    public static void main(String[] args) {
        
        //1. 파일 출력(쓰기)
        //- 자바에서 사용되는 데이터를 자바 외부(c:/java)에 메모장으로 저장
        try{
            //예외가 발생 할것 같은 코드르 try{ } 안에서 작성한다
            //c드라이브에 'java' 폴더 생성
//        FileOutputStream fileOutput = new FileOutputStream("c:/java/test1.txt");
            
            // - 현재 프로젝트내 'src -> day25 -> test1.txt'파일 생성한다
        FileOutputStream fileOutput = new FileOutputStream("./src/day25/test1.txt");
        fileOutput.write(("Hello java").getBytes());
        //fileOutput[객체].write[메소드]( 인자값1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }catch (Exception e){
            //모든 예외가 발생 했을때 실행되는 코드 작성한다
            // ( Exception : 예외클래스의 최상위클래스)
            e.printStackTrace();
        }finally {
            //예외가 있던 없던 실행되는 코드 작성한다.

        }
    }
}
