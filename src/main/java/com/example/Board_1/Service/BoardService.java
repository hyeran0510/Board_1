package com.example.Board_1.Service;


import com.example.Board_1.Entity.Board;
import com.example.Board_1.Repository.BoardRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepositoty boardRepositoty;

    public void write(Board board) {
        boardRepositoty.save(board);
    }


}
