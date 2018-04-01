import java.util.Scanner;

public class funAndScanner {
    public static void main(String[] args) {
        System.out.println("请输入第一个数");
        Scanner s1 = new Scanner(System.in);
        int num1 = s1.nextInt();
        System.out.println("请输入第二个数");
        Scanner s2 = new Scanner(System.in);
        int num2 = s2.nextInt();
        int result1 = inputTwoNum(num1, num2);
        System.out.println("结果是" + result1);
        // ======================================
        String result2 = isEqual(num1, num2);
        System.out.println("判断相等的结果是" + result2);
        // ======================================
        System.out.println("请输入第三个数,我可以找到最大的那个数");
        Scanner s3 = new Scanner(System.in);
        int num3 = s3.nextInt();
        int result3 = findMaxNum(num1, num2, num3);
        System.out.println(result3);
    }

    // 录入键盘的两个数相加
    private static int inputTwoNum(int num1, int num2) {
        return num1 + num2;
    }

    // 判断录入键盘的数是否相等
    private static String isEqual(int num1, int num2) {
        if (num1 == num2) {
            return "两个数是相等的哦 ^_^";
        } else {
            return "两个数不是相等的 ~_~; 数字1 => " + num1 + ",  数字2 =>" + num2;
        }
    }

    // 根据键盘录入的数来找出最大的那个值
    private static int findMaxNum(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
}
