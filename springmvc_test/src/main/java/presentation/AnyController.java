package presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import 공통.Board;

@Controller
public class AnyController {
	
	@GetMapping("/test")
	public ModelAndView process() {
		//요청 처리
		System.out.println("tttttttttttessssssst");
		System.out.println("이건 뭐하는 기능이지?");
		// 브라우저에서 localhost:8080/test를 통해 요청하게 되면 print문이 콘솔창에 출력됨 
		
		//흐름 제어
		ModelAndView mv = new ModelAndView();
		//mv.setViewName("view1");//view(jsp) 지정 WEB-INF/views/view1.jsp있다.
		//mv.addObject("name1","value1");//뷰에 name1이름으로 value1데이터 보내기 
		return mv;
	}	
	@GetMapping("/test1")
	// 이렇게 하나 더 만들어도 디렉토리만 바꿔주면 얼마든지 콘솔창에 출력 가능 
	public ModelAndView test1요청처리하다() {
		//요청 처리
		System.out.println("test1이 mapping된 것을 확인할 수 있음");
		// 브라우저에서 localhost:8080/tes1t를 통해 요청하게 되면 print문이 콘솔창에 출력됨 
		
		//흐름 제어
		ModelAndView mv = new ModelAndView();
//		mv.setViewName("test1");//view(jsp) 지정 WEB-INF/views/view1.jsp있다.
		//mv.addObject("name1","value1");//뷰에 name1이름으로 value1데이터 보내기 
		return mv;
	}
	
	@GetMapping("/test2")
	// 이렇게 하나 더 만들어도 디렉토리만 바꿔주면 얼마든지 콘솔창에 출력 가능 
	public ModelAndView test2요청처리하다(int no, String name) {
		//요청 처리
		
		// test2는 no라는 이름으로 값을 주고 있으므로 입력값을 지정 
		System.out.println("test2이 mapping된 것을 확인할 수 있음");
		// 브라우저에서 localhost:8080/tes1t를 통해 요청하게 되면 print문이 콘솔창에 출력됨
		
		System.out.println(no);
		// main.jsp에서의 no값을 출력
		// main 홈페이지에서 test요청과 no이름으로 값1을 보냄 이라는 링크를 클릭하게 되면 콘솔창에 print문들이 출력되는 것을 확인할 수 있음
		System.out.println(name);
		// main의 test2에서 지정한 값 중 하나인 name를 출력  
		
		//흐름 제어
		ModelAndView mv = new ModelAndView();
		mv.setViewName("view2");
		//view(jsp) 지정 WEB-INF/views/view2.jsp있다.
		mv.addObject("v1",no);
		//view2에 v1이름으로 no데이터와 같은 값을 보내기 
		mv.addObject("v2", name);
		// view2에 v2이름으로 name 데이터와 같은 값을 보내기 
		return mv;
	} // 이 메소드가 요청을 처리하는 것이므로 RequestHandler라고 부름 
	
	
	
	
	@GetMapping("/main")
	public ModelAndView process2() {
		//요청 처리
//		System.out.println("tttttttttttessssssst");
//		System.out.println("이건 뭐하는 기능이지?");
		// 브라우저에서 localhost:8080/test를 통해 요청하게 되면 print문이 콘솔창에 출력됨 
		
		
		//흐름 제어
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");//main(jsp) 지정 WEB-INF/views/main.jsp있다.
		// main.jsp파일이 WEB-INF/views/main.jsp에 있다.
		// main.jsp는 뷰라고 표현하며 localhost:8080/main으로 접근하면 main에 적은 내용을 볼 수 있음 
		return mv;
	}	
	
	
	@PostMapping("/test3")
	
	// 위의 것과 다르게 GetMapping이 아니라 PostMapping해야함
	public ModelAndView process3(Board 새게시물) {
		// Board 새게시물을 입력으로 받을려면 import 해야함 
		//요청 처리
		System.out.println("test3요청처리하다");
		System.out.println(새게시물.getTitle());
		System.out.println(새게시물.getContents());
		// 공통에서 Board를 통해 get으로 값을 받아오는지 확인 
		//흐름 제어
		ModelAndView mv = new ModelAndView();

		return mv;
	}	
	
@PostMapping("/test4")
	
	// 위의 것과 다르게 GetMapping이 아니라 PostMapping해야함
	public ModelAndView process4(Board 새게시물) { 
		// Board 새게시물을 입력으로 받을려면 import 해야함 
		//요청 처리
		System.out.println("test4요청처리하다");
		System.out.println(새게시물.getTitle());
		System.out.println(새게시물.getContents());
		// 공통에서 Board를 통해 get으로 값을 받아오는지 확인 
		//흐름 제어
		ModelAndView mv = new ModelAndView();
		mv.setViewName("view3");
		// view3.jsp 생성 및 연결 
		mv.addObject("v1", 새게시물);
		// view3.jsp에 v1이라는 이름으로 게시물객체 전달 

		return mv;
	}	
}
