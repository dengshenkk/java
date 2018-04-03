import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        /*
         * Math.random()默认是double类型, 使用(int)(double)格式将double强转为int
         */
        int num = (int) (Math.random() * 100) + 1;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你猜中的一个数(1-100)");
        int test = sc.nextInt();
        while (true) {
            if (test > 100 || test < 0) {
                System.out.println("格式不对,请重新输入");
                test = sc.nextInt();
                continue;
            }
            count++;
            if (num > test) {
                System.out.println("你输入的数太小了哦");
                test = sc.nextInt();
            } else if (test > num) {
                System.out.println("你输入的数太大了哈");
                test = sc.nextInt();
            } else {
                System.out.println("恭喜你,猜对了!!!一共猜了" + count + "次, 但是没奖   |||-_-");
                break;
            }
        }
    }
}
