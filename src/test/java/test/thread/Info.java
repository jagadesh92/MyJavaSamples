/**
 * 
 */
package test.thread;
/**
 * 
 * @Description: TODO(添加描述)
 * @Date 2014年10月10日-上午10:20:52
 * @Author: qizai
 * @Version: V1.0.0
 */
public class Info {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public synchronized void set(String name, int age) {
		if (!flag) {
			try {
				super.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.name = name;
		// TODO 是否需要这个呢？
		 try {
		 Thread.sleep(100);
		 } catch (Exception e) {
		 e.printStackTrace();
		 }
		this.age = age;
		flag = false;
		super.notify();
	}

	public synchronized void get() {
		if (flag) {
			try {
				super.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// TODO 是否需要这个呢？
		 try {
		 Thread.sleep(100);
		 } catch (Exception e) {
		 e.printStackTrace();
		 }
		System.out.println(this.getName() + "<===>" + this.getAge());
		flag = true;
		super.notify();
	}
	private String name = "Rollen";
	private int age = 20;
	private boolean flag = false;
}
