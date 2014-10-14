/**
 * 
 */
package test.https;

import java.io.IOException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

/**
 * 
 * @Description: TODO(添加描述)
 * @Date 2014年10月13日-下午2:25:19
 * @Author: qizai
 * @Version: V1.0.0
 */
public class HttpsTest {

	@Test
	public void test_https() {
		try {
			URL url = new URL("https://192.168.1.126/shit/login");
			HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
			String in = IOUtils.toString(urlConnection.getInputStream());
			System.out.println(in);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
