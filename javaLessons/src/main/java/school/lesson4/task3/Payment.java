package school.lesson4.task3;

public class Payment {
    private int totalCost = 0;
    private Purchase[] goods = new Purchase[50];
    private int goodsCount = 0;

    void print() {
        for (int i = 0; i < goodsCount; i++) {
            System.out.println(goods[i].getLabel());
        }
        System.out.println("----------------------------");
        System.out.println("Total amount equals to " + totalCost);
    }

    void addPurchase(String label, int price) {
        Purchase p = new Purchase(label, price);
        goods[goodsCount] = p;
        goodsCount++;
        totalCost += price;
    }
    // private class можно использовать  только внутри класса Payment
    private class Purchase {
        private String label;
        private int price;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public Purchase(String label, int price) {
            this.label = label;
            this.price = price;
        }
    }
}
