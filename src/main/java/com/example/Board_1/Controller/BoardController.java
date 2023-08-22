package com.example.Board_1.Controller;


import com.example.Board_1.Entity.Board;
import com.example.Board_1.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write")
    public String boardWriteForm() {

        return "boardwrite";
    }

    @PostMapping("board/writepro")// 가로()안에 매개변수 넣어주는 것  /넘어가기 위해서 리포지토리 필요
    public String boardWritePro(Board board){
        boardService.write(board);  //보드서비스쓰면 오류나는데 @Autowired 주입해주면 오류제거
        return "";
    }


}
