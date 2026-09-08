package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item) {
        if (itemCount >= items.length) {        // 검증로직
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;                // 메인로직
        itemCount ++;
    }

    public void displayItems() {
        int total = 0;
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < itemCount; i++) {
//            System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getTotalPrice());
//            total += items[i].getTotalPrice();    내가푼것. 이것도 맞긴한데 가독성 더 좋은 정답으로 써둠.

            Item item = items[i];
            System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getTotalPrice());

        }
        System.out.println("전체 가격 합: " + total);
    }

//    private int calculateTotalPrice() {
//        int totalPrice = 0;
//        for (int i = 0; i < itemCount; i++) {
//            Item item = items[i];
//            totalPrice += item.getTotalPrice();
//        }
//        return totalPrice;
//    }                         아예 이렇게 메서드로 빼는방법도 있다.
}
