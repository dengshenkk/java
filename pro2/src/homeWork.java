import java.util.Scanner;

public class homeWork {
    /**
     * @deprecated 计算BMI 公式为 体重/(体重*身高)
     */
    static float weith;
    static float height;
    static private float result;

    public static void main(String[] args) {
        int i = 10;
        while (i >= 0) {
            System.out.println("*****BMI计算器***Å**");
            System.out.println("请输入您的身高(m)");
            Scanner height = new Scanner(System.in);
            float h = height.nextFloat();
            System.out.println("请输入您的体重(kg)");
            Scanner weith = new Scanner(System.in);
            float w = weith.nextFloat();
            result = w / (h * h);
            System.out.println("您的BMI值为" + result);
            i--;
        }
    }
}
