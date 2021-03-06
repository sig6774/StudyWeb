package 인터페이스구현;

interface 나는것 {
	public void 난다();
	public int 온도 = 0;
}

class 대한항공 implements 나는것 {
	int 온도 = 35;
	// 온도가 30이상일때 난다고 생각하는 클래스 생성 
	public void 난다() {
		if (온도 >= 30) {
			System.out.println("날아가~~~~~~");
		}
		else {
			System.out.println("못날아가~~~~~~");
		}
	}
}

// 프로펠라비행기는 나는것으로 바라볼 수 있음 
class 프로펠라비행기 implements 나는것{
	@Override
	public void 난다() {
		// 나는것에서 추상적으로 만들었던 것(난다())을 프로펠라비행기에서 그것을 보완한다는 느낌으로 가자
		// Override : 추상적인 것을 보완해서 온전하도록 조정한 것이라는 뜻  즉, 원래 있는 행동(메소드)에 자세한 기능을 추가한 것이라고 생각하자
		System.out.println("프로펠라로 난다.");	
	}
}

class 드론비행기 implements 나는것{
	@Override
	public void 난다() {
		// 나는것에서 추상적으로 만들었던 것(난다())을 프로펠라비행기에서 그것을 보완한다는 느낌으로 가자
		// Override : 추상적인 것을 보완해서 온전하도록 조정한 것이라는 뜻  즉, 원래 있는 행동(메소드)에 자세한 기능을 추가한 것이라고 생각하자
		System.out.println("드론으로 난다.");	
	}
}




public class App {

	public static void main(String[] args) {
		대한항공 프1 = new 대한항공();
		프1.난다();
		프1.온도 = 29;
		프1.난다();
		
		프로펠라비행기 한프로펠라비행기 = new 프로펠라비행기();
		// 클래스로 바라봤다는 뜻 (구체적으로 봤다)
		한프로펠라비행기.난다();
		나는것 한나는것 = new 프로펠라비행기();
		// 인터페이스로 바라봤다는 뜻 (추상적(대략적)으로 봤다)
		한나는것.난다();
		
		드론비행기 한드론비행기 = new 드론비행기();
		한드론비행기.난다();
		나는것 나는것하나 = new 드론비행기();
		나는것하나.난다();
		
		나는것 나는것둘 = 한드론비행기;
		나는것둘.난다();
		// 이렇게도 표현가능 
		// '나는것' 으로 생성된 것은 구체적인 것(객체)에 영향을 받지않는 이름 
		// '프로펠라비행기'와 '드론비행기'는 그 클래스에 해당되는 객체만 생성할 수 있는데 '나는것'은 어디든지 생성할 수 있음
		
		// 인터페이스를 쓰게 되면 코드의 변형이 많이 없게 되므로 많이 사용할 듯?
		

	}

}
