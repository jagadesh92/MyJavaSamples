/**
 * 
 */
package test.thread;
/**
 * 
 * @Description: TODO(添加描述)
 * @Date 2014年10月10日-上午10:22:20
 * @Author: qizai
 * @Version: V1.0.0
 */
public class Test {
	public static void main(String[] args) {
		Info info = new Info();
		Producer pro = new Producer(info);
		Consumer con = new Consumer(info);
		new Thread(pro).start();
		new Thread(con).start();
	}
}
