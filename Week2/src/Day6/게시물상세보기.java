package Day6;

class 게시물{
	int 번호;
	String 제목;
	String 내용;
	String 작성일;
}

class 게시물저장소{
	게시물[] 모든게시물;
	게시물저장소() {
		this.모든게시물 = new 게시물[3];
		
		this.모든게시물[0] = new 게시물();
		this.모든게시물[0].번호 = 3;
		this.모든게시물[0].제목 = "한식";
		this.모든게시물[0].내용= "비빔밥";
		
		this.모든게시물[1] = new 게시물();
		this.모든게시물[1].번호 = 2;
		this.모든게시물[1].제목 = "중식";
		this.모든게시물[1].내용= "볶음밥";
		
		this.모든게시물[2] = new 게시물();
		this.모든게시물[2].번호 = 1;
		this.모든게시물[2].제목 = "일식";
		this.모든게시물[2].내용= "초밥";
	}
	
	int 게시물개수() {
		return this.모든게시물.length;
	}
	
	게시물 특정게시물찾기(int 게시물번호) {
		return this.모든게시물[게시물번호-1];
	}
	
	게시물[] 모든게시물() {
		return this.모든게시물;
	}
}


class 게시물관리자{
	게시물저장소 한저장소 = new 게시물저장소();
	게시물 게시물을조회하다(int 게시물번호) {
		return this.한저장소.특정게시물찾기(게시물번호);
	}
	
	게시물[] 게시물모두수집() {
		return this.한저장소.모든게시물;
	}
}


public class 게시물상세보기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int 게시물번호 = 2;
		게시물관리자 게시물과장 = new 게시물관리자();
		게시물 조회페이지 = 게시물과장.게시물을조회하다(게시물번호);
		
		System.out.println(조회페이지.번호);
		System.out.println(조회페이지.제목);
		System.out.println(조회페이지.내용);
		
		게시물[] 모든 = 게시물과장.게시물모두수집();
		System.out.println(모든[0].제목);
		
		

	}

}
