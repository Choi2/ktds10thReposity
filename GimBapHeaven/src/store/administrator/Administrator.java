package store.administrator;

public class Administrator {
	
	private int income;
	private final String [] menu = {"김밥", "김치찌개", "돈까스"};
	private final int [] priceOfmenu = {1000, 4000, 6000};

	
	public Administrator(int income) {this.income = income;}
	public Administrator() {}
	
	public int getIncome() {return income;}
	public void setIncome(int income) { this.income = income;}
	
	
	public String[] getMenu() { return menu;}
	
	
	public void addIncome(int income) {this.income += income;}
	
	
	public int[] getPriceOfmenu() { return priceOfmenu;}
	
	
	public void showMenu()
	{
		System.out.println("================================================================");
		System.out.println("메뉴를 선택해주세요.^^");
		System.out.println("(사용자 체크 4, 가게 체크 5, 종료는 999)");
		
		for(int i = 0; i < menu.length; i++)
		{
			String message = String.format("%d. %s ", i+1, menu[i]);
			System.out.print(message);
		}
		
		System.out.println("\n================================================================");

	}
	
	public void checkIncome(){System.out.println("가게 총 수입 : " + this.income);}
	
}
