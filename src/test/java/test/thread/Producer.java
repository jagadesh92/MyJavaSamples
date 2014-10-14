/**
 * 
 */
package test.thread;
/**
 * 
 * @Description: TODO(添加描述)
 * @Date 2014年10月10日-上午10:21:23
 * @Author: qizai
 * @Version: V1.0.0
 */
public class Producer implements Runnable {

	private Info info = null;

	Producer(Info info) {
		this.info = info;
	}
	@Override
	public void run() {
		boolean flag = false;
		for (int i = 0; i < 25; ++i) {
			if (flag) {
				this.info.set("Rollen-" + i, 20 + i);
				flag = false;
			} else {
				this.info.set("ChunGe-" + i, 100 + i);
				flag = true;
			}
		}
	}

}
