package com.example.Board_1.Repository;


import com.example.Board_1.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepositoty  extends JpaRepository<Board, Integer> {

}
