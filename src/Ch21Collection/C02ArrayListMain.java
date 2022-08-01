package Ch21Collection;

import java.util.ArrayList;
import java.util.List;

class BoardDTO
{
	private int No;
	private String Title;
	private String contents;
	private String writer;
	private String regdate;
	
	//toString
	
	@Override
	public String toString() {
		return "BoardDTO [No=" + No + ", Title=" + Title + ", contents=" + contents + ", writer=" + writer
				+ ", regdate=" + regdate + "]";
	}
	
	public BoardDTO(int no, String title, String contents, String writer, String regdate) {
		super();
		No = no;
		Title = title;
		this.contents = contents;
		this.writer = writer;
		this.regdate = regdate;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof BoardDTO)
		{
			BoardDTO down = (BoardDTO)obj;
			return this.No == down.No;
		}
		
		return false;
	}
	
	
	
}

public class C02ArrayListMain {
	
	public static void addDTO(List<BoardDTO> list, BoardDTO dto)
	{
		list.add(dto);
	}
	
	public static void ShowDTO(List<BoardDTO> list)
	{
		for(BoardDTO dto : list)
		{
			System.out.println(dto.toString());
		}
	}

	public static void main(String[] args) {
		
		List<BoardDTO> list = new ArrayList();
		//키보드로 BoardDTO 단위의 값을 하나 이상 받아(no, title, contents, writer, regdate)
		//list에 저장하세요
		//list에 저장된 BoardDTO를 모두 확인해보세요
		
		addDTO(list, new BoardDTO(1, "제목1", "내용1", "작성자1", "2022-08-01"));
		addDTO(list, new BoardDTO(2, "제목2", "내용2", "작성자2", "2022-08-02"));
		addDTO(list, new BoardDTO(3, "제목3", "내용3", "작성자3", "2022-08-03"));
		addDTO(list, new BoardDTO(4, "제목4", "내용4", "작성자4", "2022-08-04"));
		
		BoardDTO search = new BoardDTO(6, "제목2", "내용2", "작성자2", "2022-08-02");
		
		if(list.contains(search))
			System.out.println("존재합니다");
		else
			System.out.println("존재하지않습니다");
		
		ShowDTO(list);
		
		
		
		
	}

}
