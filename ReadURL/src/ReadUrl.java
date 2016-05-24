import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;



public class ReadUrl
{
	public static void main(String args[])
	{
		try {
			URL url = new URL("http://feeds.reuters.com/reuters/lifestyle");
			InputStream stream = url.openStream();
			BufferedInputStream buffer = new BufferedInputStream(stream);
			StringBuilder sb = new StringBuilder();
			while(true)
			{
				int b;
				b=buffer.read();
				if(b== -1)
					break;
				else
				{
					sb.append((char)b);
				}
			}
			System.out.println(sb.toString());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}