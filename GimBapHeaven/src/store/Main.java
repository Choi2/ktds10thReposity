package store;

import java.util.Scanner;

import store.administrator.Administrator;
import store.buyer.Buyer;





/**
 * - 음식점 - 
 * 
 * '음식점'이라는 공간에서 소비자는 주문을 하고, 
 * 파는 사람은 소비자에게 해당 음식을 제공해준다.
 * 
 * '999'를 누르면 프로그램이 종료된다.
 * 
 * @author SeongJin
 *
 */
public class Main {

	public static void main(String[] args) {
		new Main().start();
	}
	
	public void start()
	{
		Scanner input = new Scanner(System.in);
		Buyer SeongJin = new Buyer(15000);
		Administrator mother = new Administrator(10000);
		
		while(true)
		{
			mother.showMenu();
			int selectedNum = input.nextInt();
		
			switch(selectedNum)
			{
				case 4:
					SeongJin.checkMoneyAndFood();
					break;
					
				case 5:
					mother.checkIncome();
					break;
					
				case 999:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					
				default:
					SeongJin.buy(selectedNum, mother);	
			
			}
				
				
		
		}
	}

}
