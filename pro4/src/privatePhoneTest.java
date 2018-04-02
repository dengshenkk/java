class privatePhone {
    /**
     * brand 品牌
     * price 价钱
     * color 颜色
     */
    private String brand;
    private String color;
    private int price;

    public String getBrand() {
        return this.brand;
    }

    // get/set品牌
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return this.price;
    }

    // get/set价钱
    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    // get/set颜色
    public void setColor(String color) {
        this.color = color;
    }

    public void showInfo() {
        System.out.println("品牌: " + this.brand);
        System.out.println("价钱: " + this.price);
        System.out.println("颜色: " + this.color);
    }

}

class privatePhoneTest {
    public static void main(String[] args) {
        privatePhone apple = new privatePhone();
        apple.setBrand("苹果");
        apple.setColor("玫瑰金");
        apple.setPrice(6666);
        apple.showInfo();
        privatePhone mi = new privatePhone();
        mi.setBrand("小米");
        mi.setColor("不锈钢");
        mi.setPrice(999);
        mi.showInfo();
    }
}