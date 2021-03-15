import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author holten
 * @date 2021/3/8
 */
class Q1357_ApplyDiscountEveryNOrders {
    public static void main(String[] args) {
        int[] products = {1, 2, 3, 4, 5, 6, 7};
        int[] prices = {100, 200, 300, 400, 300, 200, 100};
        Cashier cashier = new Cashier(3, 2, products, prices);
    }

    static class Cashier {
        int count;
        int discount;
        int n;
        Map<Integer, Integer> productPrice;

        public Cashier(int n, int discount, int[] products, int[] prices) {
            this.count = 0;
            this.discount = discount;
            this.n = n;
            productPrice = new HashMap<>();
            for (int i = 0; i < products.length; i++) {
                productPrice.put(products[i], prices[i]);
            }
        }

        public double getBill(int[] product, int[] amount) {
            boolean needDiscount = (++count) % n == 0;
            double total = 0;
            for (int i = 0; i < product.length; i++) {
                total = total + (productPrice.get(product[i]) * amount[i]);
            }
            if (needDiscount) {
                return total - (discount * total) / 100;
            } else {
                return total;
            }
        }
    }

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */
}