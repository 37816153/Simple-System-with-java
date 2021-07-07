package mainSentaBotaClasses;

public class Venda {
	private int totalValueCar = 0;
	
	public void adicionaCarrinho(int x) {
		this.totalValueCar += x;
	}
	
	public int getCarValue() {
		return totalValueCar;
	}

}
