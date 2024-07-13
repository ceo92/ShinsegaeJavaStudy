package board_project.local;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BoardRepository {

  private static final Map<Integer, Board> store = new HashMap<>(); //1부터 시작됨
  private static int sequence = 1;

  public int save(Board board){
    board.setBno(sequence++);
    store.put(board.getBno(), board);
    return board.getBno(); //저장된 id만 반환
  }


  public Optional<Board> findByBno(int bno){
    return Optional.ofNullable(store.get(bno));
  }


  public List<Board> findAll(){
    return new ArrayList<>(store.values());
  }

  public void remove(int bno){
    Board removeBoard = findByBno(bno).orElseThrow();
    store.remove(bno, removeBoard);
  }

  public void removeAll(){
    store.clear();
  }

}
