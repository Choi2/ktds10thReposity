package store.buyer;

import store.administrator.Administrator;

/**
 * - 소비자 -
 * 1. 속성 : 돈(현재 소유 하고 있는)
 * 2. 행동 : 주문하기, 현재 먹은 음식과 남은 돈 확인하기
 */

public class Buyer {
	
	private int money;
	private boolean  [] checkEatFood;
	
	public Buyer(int money) {
		this.money = money;
		checkEatFood = new boolean[3];
	}
	
	public void buy(int selectedNum, Administrator administrator)
	{

		String [] outputMenu = administrator.getMenu();
		int [] outputPrice = administrator.getPriceOfmenu();
		
		System.out.println(outputMenu[selectedNum - 1] + "를 주문하셨습니다.");
		this.money -= outputPrice[selectedNum - 1];
		checkEatFood[selectedNum - 1] = true;
		administrator.addIncome(outputPrice[selectedNum - 1]);
		System.out.println();
		
	}
	
	public void checkMoneyAndFood()
	{
		String [] outputMenu = new Administrator().getMenu();
		System.out.println("사용자는 이와 같은 음식을 드셨고, 남은 금액은 다음과 같습니다.");
		
		for(int i = 0; i < checkEatFood.length; i ++)
		{
			if(checkEatFood[i])
				System.out.print(outputMenu[i] + " ");
		}
		
		System.out.println();
		System.out.println("남은 금액은 " + this.money);
		
	}
	
}
