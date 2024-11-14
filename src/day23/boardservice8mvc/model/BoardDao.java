package day23.boardservice8mvc.model;

import java.util.ArrayList;

public class BoardDao {

    ArrayList<BoardDto> boardDb = new ArrayList<>()

    //1. 게시물 등록 접근 함수
    public boolean boardWrite( BoardDto boardDto){
        boardDb.add( boardDto);
        return true;
    }

    public void boardPrint(){

    }
}
