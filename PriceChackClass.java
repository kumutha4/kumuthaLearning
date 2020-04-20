import java.util.Scanner;

public class PriceChackClass {

	public static void main(String[] args) {

		int productSize;
		int productPrizeSize;
		int productSoldSize;
		int productSoldPrice;
		int wrongSoldproduct = 0;
		Scanner in = new Scanner(System.in);
		productSize = in.nextInt();
		String[] productsName = new String[productSize];
		if (productSize >= 1) {
			for (int i = 0; i < productSize; i++) {
				String productName = in.next();
				productsName[i] = productName;

			}
		}

		productPrizeSize = in.nextInt();
		String[] productPrice = new String[productPrizeSize];
		if (productPrizeSize >= 1) {
			for (int i = 0; i < productPrizeSize; i++) {
				String productPrize = in.next();
				productPrice[i] = productPrize;
			}
		}

		productSoldSize = in.nextInt();
		String[] productsSoldName = new String[productSoldSize];

		if (productSoldSize >= 1) {
			if (productSoldSize <= productSize) {
				for (int i = 0; i < productSoldSize; i++) {
					String productsSold = in.next();
					productsSoldName[i] = productsSold;

				}
			} else {
				System.out.println("product sold size is greater than the product size");
			}
		}

		productSoldPrice = in.nextInt();
		Float[] productsSoldpriceArray = new Float[productSoldPrice];
		if (productSoldPrice >= 1) {
			for (int i = 0; i < productSoldPrice; i++) {
				float productsSold = in.nextFloat();
				productsSoldpriceArray[i] = productsSold;
			}
		}

		for (int i = 0; i < productSize; i++) {
			for (int j = 0; j < productSoldSize; j++) {
				if (productsName[i].equals(productsSoldName[j])) {
					float productSldPrice = productsSoldpriceArray[j];
					float pdtPrice = Float.parseFloat(productPrice[i]);
					if (productSldPrice != pdtPrice) {
						wrongSoldproduct++;
					}
				}
			}
		}
		System.out.println(wrongSoldproduct);

	}

}
