package in.ashokit;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

/**
 * Hello world!
 *
 */
public class App {

	public static String encode(String txt) {

		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());
	}

	public static String decode(String enctxt) {
		Decoder decoder = Base64.getDecoder();
		byte[] bArray = decoder.decode(enctxt);
		return new String(bArray);
	}

	public static void main(String[] args) {

		String fname = App.encode("sharath");
		System.out.println(fname);
		String dfname = App.decode(fname);
		System.out.println(dfname);

	}

}