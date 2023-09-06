package com.example.demo.controller;

import com.example.demo.model.BoardModel;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/board")
public class Board {

    @Autowired
    BoardService boardService;
    @PostMapping("/save")
    public String createBoard(@RequestBody BoardModel board){
        return boardService.makeBoard(board);
    }
}
