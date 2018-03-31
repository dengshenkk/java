public class homeWork {
    public static void main(String[] args) {
        /**
         * 小芳的妈妈每天给她2.5元,每当存钱的天数是5的倍数时,小芳就会去花掉6元;
         * 问小芳存够100元需要多少天
         */
        double dayMoney = 2.5;
        double moneySum = 0;
        int day = 1;
        while (moneySum <= 100) {
            if (day % 5 == 0) {
                moneySum -= 6;
                System.out.println("第" + day + "天花了6元,还剩下" + moneySum);
            } else {
                moneySum += dayMoney;
            }
            System.out.println("钱 => "+moneySum+"    天数=>" + day);
            day++;
        }
        System.out.println("小芳需要花" + day + "天,存够了" + moneySum + "元!");
    }
}
