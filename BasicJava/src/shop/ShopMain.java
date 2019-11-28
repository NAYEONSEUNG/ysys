package shop;

import java.util.Scanner;

public class ShopMain {
	public static void main(String[] args) {
		//사용자에게 값을 입력(회원관련 기능 구현)
		//1.회원가입
		//2.회원수정
		//3.회원탈퇴
		//
		//객체생성(사용자키보드 값을 받기 위한)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒Shoooop ver1.5");
		System.out.println("▒1.회원가입");
		System.out.println("▒2.회원수정");
		System.out.println("▒3.회원탈퇴");
		int num;
		while(true) {
		System.out.print("▒ 번호>>");
		// 키보드 정수값을 입력받아 num 변수에 담는코드
		
		
		num = sc.nextInt();
		//1,2,3외의값이 들어온 경우 error발생
		//및 다시 번호를 입력받음
		//1,2,3이 들어온 경우 while()문을 break
		if(num < 1 || num > 3) {
			System.out.println("▒Error>>1, 2, 3의 값을 입력하세요");
			continue;
		  }else {
			  break;
		  }
		}			
		//==>사용자가 입력한값은 1,2,3중에하나
		Member mem = new Member();
		if(num == 1) {//회원가입
			String id = "nys";
			String pw = "1234";
			String name ="연승";
			String result = mem.memInsert(id, pw, name);//어딜갔다와?
			//문자열 동등비교시에는equals()사용 (==x)
		if(result == "success") {
				System.out.println("회원가입성공! 메인페이지로이동합니다.");
				
			}else {
				System.out.println("회원가입 실패! 에러메시지 출력");
			}
		
			
		}else if (num == 2) { //회원수정
			mem.memUpdate();
		}else if (num == 3) { //회원탈퇴
			String id = "nys";
			String pw = "1234";
			mem.memDelete(id, pw);
		}
		
	}//메인
	
	
}//크래스
