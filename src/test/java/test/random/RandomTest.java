/**
 * 
 */
package test.random;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

/**
 * 
 * @Description: TODO(添加描述)
 * @Date 2014年10月13日-下午2:49:28
 * @Author: qizai
 * @Version: V1.0.0
 */
public class RandomTest {
	@Test
	public void test_Random() {
		for (int i = 0; i < 19; i++) {
			// System.out.println(RandomStringUtils.randomAlphabetic(4));
			System.out.println(RandomStringUtils.random(6,
					"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
			// System.out.println(RandomStringUtils.randomAlphanumeric(4));
			// System.out.println(RandomStringUtils.randomAscii(4));
			// System.out.println(RandomStringUtils.randomNumeric(4));
			System.out.println("##################");
		}
	}
}
