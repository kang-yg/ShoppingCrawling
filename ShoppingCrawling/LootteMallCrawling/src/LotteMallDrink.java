import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class LotteMallDrink {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://www.lottemart.com/category/categoryList.do?CategoryID=C0010017").get();
			Elements hotdeal = doc.select("");
			Elements deal = hotdeal.select("");
			
			for(Element e : deal) {
				System.out.println(e.text());
			}
			System.out.println("------------------------------1������------------------------------------------");
		}catch (IOException e) {e.printStackTrace();
		}
	}
}
