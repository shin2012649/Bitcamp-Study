package bitcamp.myapp.service;

import bitcamp.util.Transactioal;
import bitcamp.myapp.dao.BoardDao;
import bitcamp.myapp.vo.AttachedFile;
import bitcamp.myapp.vo.Board;

import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class DefaultBoardService implements BoardService {

    BoardDao boardDao;

    public DefaultBoardService(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    @Transactioal // 이 메서드는 트랜잭션 상태에서 실행하라고 지정
    @Override
    public int add(Board board) throws Exception {
            int count = boardDao.insert(board);
            if (board.getAttachedFiles().size() > 0) {
                boardDao.insertFiles(board);
            }
            return count;
            }



    @Override
    public List<Board> list(int category) throws Exception {
        return boardDao.findAll(category);
    }

    @Override
    public Board get(int boardNo) throws Exception {
        return boardDao.findBy(boardNo);
    }

    @Transactioal
    @Override
    public int update(Board board) throws Exception {
            int count = boardDao.update(board);
            if (count > 0 && board.getAttachedFiles().size() > 0) {
                boardDao.insertFiles(board);
            }
            return count;
        }

    @Transactioal
    @Override
    public int delete(int boardNo) throws Exception {
            boardDao.deleteFiles(boardNo);
             return boardDao.delete(boardNo);
    }

    @Transactioal
    @Override
    public int increaseViewCount(int boardNo) throws Exception {
        return boardDao.updateCount(boardNo);
    }

    @Override
    public AttachedFile getAttachedFile(int fileNo) throws Exception {
        return boardDao.findFileBy(fileNo);
    }

    @Override
    public int deleteAttachedFile(int fileNo) throws Exception {
        return 0;
    }
}
