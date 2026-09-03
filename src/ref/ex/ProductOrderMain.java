package ref.ex;

public class ProductOrderMain {
    public static void main(String[] args) {


        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;

        ProductOrder[] orders = {tofu, kimchi, coke};

        for (ProductOrder o : orders) {
            System.out.println("상품명: " + o.productName + ", 가격: " + o.price + ", 수량: " + o.quantity);
        }

        int total = tofu.price * tofu.quantity + kimchi.price * kimchi.quantity + coke.price * coke.quantity;
        System.out.println("총 결제금액: " + total);
    }
}
