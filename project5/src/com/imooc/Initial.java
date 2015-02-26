package com.imooc;

public class Initial {

	public Initial() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone tel1 = new CellPhone();
		tel1.call();
		tel1.message();
		Telephone tel2 = new SmartPhone();
		tel2.call();
		tel2.message();
		IPlayGame ip1 = new SmartPhone();
		IPlayGame ip2 = new Psp();
		SmartPhone s = new SmartPhone();
		s.playGame();
		ip1.playGame();
		ip2.playGame();
		IPlayGame ip3 = new IPlayGame() {			
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类的方式1");
			}
		};
		ip3.playGame();
		
		new IPlayGame() {
			
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类的方式2");
			}
		}.playGame();
	}

}
