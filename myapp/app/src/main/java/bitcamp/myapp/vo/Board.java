package bitcamp.myapp.vo;

public class Board {

  private static int boardNum = 1;

  private int no;
  private String title;
  private String content;
  private String writer;
  private String password;
  private int viewCount = 0;
  private Long createdDate;

  public Board(String title, String content, String writer, String password) {
    this.no = boardNum;
    this.title = title;
    this.content = content;
    this.writer = writer;
    this.password = password;
    this.createdDate = System.currentTimeMillis();
    boardNum++;
  }

  public int getNo() {
    return this.no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public int getViewCount() {
    return viewCount;
  }

  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }

  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}