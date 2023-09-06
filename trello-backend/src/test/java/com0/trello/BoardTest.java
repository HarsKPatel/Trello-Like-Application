package com0.trello;

import com0.trello.Board.model.Board;
import com0.trello.Board.repository.BoardRepository;
import com0.trello.Board.service.BoardService;
import com0.trello.WorkSpace.model.WorkSpace;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BoardTest{

    @Mock
    BoardRepository boardRepository;

    @InjectMocks
    BoardService boardService;

    @Test
    public void createBoardTest()
    {
        Board board=new Board();
        board.setId(1);
        board.setBoardName("Harsh1");

        when(boardRepository.save(board)).thenReturn(board);

        Board b1= boardService.createBoard(board);

        assertEquals(board,b1,"Board Not created");
        verify(boardRepository).save(board);
    }

    @Test
    public void createEmptyBoardTest()
    {
        Board board = null;

        Board b1= boardService.createBoard(board);

        assertEquals(null,b1,"Empty board cannot be created");

    }

    @Test
    public void updateBoardTest()
    {
        Board board = new Board();
        board.setId(1);
        board.setBoardName("Harsh1");

        when(boardRepository.findById(1)).thenReturn(java.util.Optional.of(board));
		Board Board1=new Board();
		Board1.setId(1);
		Board1.setBoardName("Harsh2");

        String response = boardService.updateBoard(Board1);
        assertEquals("Board Updated Successfully",response,"Board is not updated successfully");
        verify(boardRepository).findById(1);
    }

    @Test
    public void testGetAllBoardsInWorkspace_BoardsExist() {

        WorkSpace workSpace=new WorkSpace();
        workSpace.setId(1);
        workSpace.setWorkSpaceName("harsh1");
        workSpace.setWorkSpaceDetail("hello");

        ArrayList<Board> boards = new ArrayList<>();
        boards.add(new Board(1, "Board 1", workSpace));
        boards.add(new Board(2, "Board 2", workSpace));
        boards.add(new Board(3, "Board 3", workSpace));
        when(boardRepository.findAll()).thenReturn(boards);
        List<Board> boardsInWorkspace = boardService.getAllBoardsInWorkspace(1);

        assertEquals(3,boardsInWorkspace.size());
        verify(boardRepository).findAll();
        }
    }


