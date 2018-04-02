class Phone {
    /**
     * 定义一个手机类
     * - 属性
     * -- 品牌
     * -- 价格
     * -- 颜色
     * - 方法
     * -- 打电话
     * -- 发短信
     * -- 玩游戏
     */
    String brand;
    int price;
    String color;

    public void call(String name) {
        System.out.println("打电话给" + name);
    }

    public void sendMessage() {
        System.out.println("发短信给某人");
    }

    public void playGame() {
        System.out.println("打飞机中....");
    }

    public void phoneInfo() {
        System.out.println("品牌:" + brand + "  价钱:" + price + "   颜色:" + color);
    }
}

class PhoneTest {
    public static void main(String[] args) {
        Phone iPhone = new Phone();
        iPhone.brand = "苹果";
        iPhone.color = "磨砂黑";
        iPhone.price = 8000;
        iPhone.call("张三");
        iPhone.sendMessage();
        iPhone.playGame();
        iPhone.phoneInfo();
    }
}
