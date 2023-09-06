package com.example.demo.service;

import com.example.demo.model.BoardModel;
import com.example.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BoardService {
    @Autowired
    BoardRepository boardRepository;

    public String makeBoard(BoardModel board) {
        int Board_id;
        int Workspace_id;
        String Board_name;
        boardRepository.save(board);
        return"information created properly and successfully for Board";
    }
}
