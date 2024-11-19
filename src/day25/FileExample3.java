package day25;

import java.io.*;
import java.util.Scanner;

public class FileExample3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("저장할 내용을 입력해주세요 : ");
        String outStr = sc.next();
        try {
            //예외가 발생 할것 같은 코드르 try{ } 안에서 작성한다
            //c드라이브에 'java' 폴더 생성
//        FileOutputStream fileOutput = new FileOutputStream("c:/java/test1.txt");
            // - 현재 프로젝트내 'src -> day25 -> test1.txt'파일 생성한다
            FileOutputStream fileOutput = new FileOutputStream("./src/day25/test2.txt");
            fileOutput.write(outStr.getBytes());
            System.out.println("[ 저장성공 ] ");
            //fileOutput[객체].write[메소드]( 인자값1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //모든 예외가 발생 했을때 실행되는 코드 작성한다
        // ( Exception : 예외클래스의 최상위클래스)
        finally {//예외가 있던 없던 실행되는 코드 작성한다.}
            try {
                FileInputStream fileInputStream = new FileInputStream("./src/day25/test2.txt");

                File file = new File("./src/day25/test2.txt");
                System.out.println(file.isFile());
                System.out.println(file.getName());
                System.out.println(file.length());

                byte[] bytes =  new byte[ (int)file.length()];
//                byte[] bytes = new byte[1000]; // 10 : "hello java" 문자열이 10바이트이므로
                fileInputStream.read(bytes);

                System.out.println(new String(bytes));
                System.out.println("[ 불러오기 성공 ] ");
                // 만약에 파일의 경로가 존재하지 않으면 예외 발생후 실행코드
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            // 만약에 읽어오는 과정에서 예외 발생 하면 실행되는 코드
            catch (IOException e) {
                e.printStackTrace();
            } finally {
            }
        }
    }
}
