/**
 * 
 */
package test.thread;
/**
 * 
 * @Description: TODO(添加描述)
 * @Date 2014年10月10日-上午10:21:56
 * @Author: qizai
 * @Version: V1.0.0
 */
public class Consumer implements Runnable {
	private Info info = null;

	public Consumer(Info info) {
		this.info = info;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 25; ++i) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			this.info.get();
		}
	}

}
