package lanqiaobei;
public class Zhipaisanjiaoxing {
		    static int count=0;
		    static int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		    public static void main(String[] args) {
		        f(a, 0);
		        System.out.println(count / 6);
		    }
		    /**
		     * @param a
		     * @param step
		     */
		    private static void f(int[] a, int step) {   
		        if(step == a.length - 1) {                      //赋值完成后进行测试
		            if(a[0] + a[1] + a[2] + a[3] == a[3] + a[4] + a[5] + a[6] && a[3] + a[4] + a[5] + a[6] == a[6] + a[7] + a[8] + a[0]) {
		                count ++;
		                return;
		            }
		        }
		        for(int i = step; i < a.length; i ++) {         //循环赋值
		            {
		                int temp = a[i];
		                a[i] = a[step];
		                a[step] = temp;
		                }
		            f(a, step + 1);      
		            int temp = a[i];
		            a[i] = a[step];
		            a[step] = temp;
		            
		        
		        }
		    }
}



