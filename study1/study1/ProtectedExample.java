package study1;



	class AnimalProtected {
		// protected로 선언된 멤버변수
		protected String name;

		// protected로 선언된 메서드
		protected void eat() {
			System.out.println(name + " is eating. ");
		}
	}

	//anmialProtecd 클래스를 상속받은 자식 클래스
	class Dog extends AnimalProtected {
		
		//dog클래스에서는 name변수에 직접 접근할 수 있음
		void bark() {
			System.out.println(name + " is barking. ");
		}
	}

	public class ProtectedExample {
		
		public static void main(String[] args) {
			//Dog클래스의 인스턴스 생성
			Dog myDog = new Dog();
			
			//protected로 선언된 멤버 변수와 메서드에 접근
			myDog.name = "Buddy";
			myDog.eat();
			myDog.bark();
	}

}
