/**
 * 制作一个JavaAPI文档
 * 命令 javadoc -d ./ -version -author XXX.java
 *
 * @author dengshenkk@gmail.com
 * @version v1.0
 */
public class ArrayTools {
    /**
     * 重写构造方法,并使用private修饰
     */
    private ArrayTools() {
    }

    /**
     * 将一个数组中的元素以toString的方式返回
     *
     * @param arr int[]
     * @return str [item1,item2,....]
     */
    public static String PrintArrayItem(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i] + "]";
            } else {
                str += arr[i] + ",";
            }
        }
        return str;
    }

    /**
     * 获取数组中的最大值
     *
     * @param arr int[]
     * @return int
     */
    public static int getArrayItemMax(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            temp = temp > arr[i] ? temp : arr[i];
        }
        return temp;
    }
}
