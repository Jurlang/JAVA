package PPT;

import java.io.IOException;


import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;


public class JSoupTest {

	public static void main(String[] args) {
		String address = "https://www.naver.com";
		try {
			Document doc = Jsoup.connect(address).get();
			String title = doc.title();
			System.out.println((title));
			Elements links = doc.getElementsByTag("a");
			for(Element link : links) {
				System.out.println(link.attr("href"));
				System.out.println(link.text());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
