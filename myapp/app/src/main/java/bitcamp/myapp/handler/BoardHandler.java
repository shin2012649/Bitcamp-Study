package bitcamp.myapp.handler;

import bitcamp.myapp.vo.Board;
import bitcamp.util.Prompt;

import java.util.Date;

public class BoardHandler {

  static final int MAX_SIZE = 100;

  static int[] no = new int[MAX_SIZE]; // 번호. boardId 집어넣음
  static Board[] boards = new Board[MAX_SIZE];

  static int length = 0;

  static final char MALE = 'M';
  static final char FEMALE = 'W';

  public static void inputBoard() {
    if (!available()) {
      System.out.println("더이상 입력할 수 없습니다!");
      return;
    }

    String title = Prompt.inputString("제목? ");
    String content = Prompt.inputString("내용? ");
    String writer = Prompt.inputString("작성자? ");
    String password = Prompt.inputString("암호? ");

    Board board = new Board(title, content, writer, password);

    boards[length++] = board;
  }

  public static void printBoards() {
    System.out.println("---------------------------------------");
    System.out.println("번호, 제목, 작성자, 조회수, 게시 날짜");
    System.out.println("---------------------------------------");


    for (int i = 0; i < length; i++) {
      Board board = boards[i];
      Date date = new Date(board.getCreatedDate()); // 게시글의 등록일 값을 가져와서 Date 인스턴스에 저장
      System.out.printf("%d, %s, %s, %d, %tY-%5$tm-%5$td\n",
              board.getNo(), board.getTitle(), board.getWriter(),
              board.getViewCount(), date);
    }
  }

  public static void viewBoard() {
    int boardNo = Prompt.inputInt("번호? ");
    for (int i = 0; i < length; i++) {
      Board board = boards[i];
      if (boards[i].getNo() == boardNo) {
        System.out.printf("제목: %s\n", board.getTitle());
        System.out.printf("내용: %s\n", board.getContent());
        System.out.printf("작성자: %s\n", board.getWriter());
        return;
      }
    }
    System.out.println("해당 번호의 게시글이 없습니다!");
  }

  public static void updateBoard() {
    String boardNo = Prompt.inputString("번호? ");
    for (int i = 0; i < length; i++) {
      Board board = boards[i];
      if (board.getNo() == Integer.parseInt(boardNo)) {
        System.out.printf("제목(%s)? ", board.getTitle());
        board.setTitle(Prompt.inputString(""));
        System.out.printf("내용(%s)? ", board.getContent());
        board.setContent(Prompt.inputString(""));
        System.out.print("새암호? ");
        board.setPassword(Prompt.inputString(""));
        System.out.printf("작성자(%s)?", board.getWriter());
        board.setWriter(Prompt.inputString(""));
        return;
      }
    }
    System.out.println("해당 번호의 게시글이 없습니다!");
  }

  private static char inputGender(char gender) {
    String label;
    if (gender == 0) {
      label = "성별?\n";
    } else {
      label = String.format("성별(%s)?\n", toGenderString(gender));
    }
    while (true) {
      String menuNo = Prompt.inputString(label +
              "  1. 남자\n" +
              "  2. 여자\n" +
              "> ");

      switch (menuNo) {
        case "1":
          return MALE;
        case "2":
          return FEMALE;
        default:
          System.out.println("무효한 번호입니다.");
      }
    }
  }

  public static void deleteBoard() {
    int boardNo = Prompt.inputInt("번호? ");

    int deletedIndex = indexOf(boardNo);
    if (deletedIndex == -1) {
      System.out.println("해당 번호의 회원이 없습니다!");
      return;
    }

    for (int i = deletedIndex; i < length - 1; i++) {
      boards[i] = boards[i + 1];
    }

    boards[--length] = null;
  }

  private static int indexOf(int boardNo) {
    for (int i = 0; i < length; i++) {
      Board board = boards[i];
      if (boardNo == board.getNo()) {
        return i;
      }
    }
    return -1;
  }

  public static String toGenderString(char gender) {
    return gender == 'M' ? "남성" : "여성";
  }

  private static boolean available() {
    return length < MAX_SIZE;
  }

}