package co.edu;

public class Board {
	// 게시글번호, 제목, 내용, 작성자, 조회횟수(조회할때마다 증가)
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private int searchCnt = 0;
	
	//생성자.
	public Board(int boardNo, String title, String content, String writer) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
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

	public int getSearchCnt() {
		return searchCnt;
	}

	public void setSearchCnt(int searchCnt) {
		this.searchCnt = searchCnt;
	}
	
	public void getInfo() {
		// 게시글번호 제목 내용 작성자 조회수
		System.out.printf("%3d %10s %15s %3s %2d", this.boardNo,this.title,this.content,this.writer,this.searchCnt);
	}
	public void getDetailInfo()	{
		//게시글 번호 		작성자
		//제목			조회수
		//내용
		String info = "========================================="+
		              "게시글번호 : %2d            작성자 : %-3s\n"+
				      "제목 : %-10s              조회수 : %3d"+
		              "내용 : %-30s" +//
		              "=========================================\n";
		
		
		System.out.printf("",this.boardNo,this.title,this.content,this.writer,this.searchCnt);
	}

}
