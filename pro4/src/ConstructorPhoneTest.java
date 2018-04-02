class ConstructorPhone {
    // 给成员变量赋值有两种方法
    // - 使用构造函数
    // - 使用Set/Get方法

    // 如果不手工指定构造函数,系统会自动生成构造函数
    private String brand;
    private String color;
    private int price;

    // 无参构造函数ConstructorPhone
    ConstructorPhone() {
        System.out.println("无参构造函数");
    }

    ConstructorPhone(String brand, String color, int price) {
        System.out.println("有参构造函数");
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void show() {
        System.out.println("品牌: " + this.brand + "  颜色: " + this.color + "  价钱: " + this.price);
    }
}

class ConstructorPhoneTest {
    public static void main(String[] args) {
        // 使用构造函数设置属性
        ConstructorPhone phone1 = new ConstructorPhone("苹果", "亮黑色", 888);
        phone1.show();
        System.out.println("---------------------------");
        ConstructorPhone phone2 = new ConstructorPhone();
        phone2.setBrand("小米");
        phone2.setColor("粉色");
        phone2.setPrice(666);
        System.out.println("品牌: " + phone2.getBrand() + "  颜色: " + phone2.getColor() + "  价钱: " + phone2.getPrice());
    }
}
