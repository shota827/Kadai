package submission;

public class Review01 {

	public static void main(String[] args) {

		//商品価格
		int price = 1500;

		//taxメソッドを呼び出す
		int taxAmount  = tax(price);

		//税込み価格の計算
		int taxPrice = price + taxAmount;

		System.out.println(price + "円の商品の税込価格は" + taxPrice + "円（消費税は" + taxAmount + "円）です。");
	}


	public static int tax(int price) {

		//消費税率
		double taxRate = 0.1;

		//消費税の計算
		int taxAmount = (int)(price * taxRate);

		//計算結果を返す
		return taxAmount;
	}

}
