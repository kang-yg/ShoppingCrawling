import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CostcoSnack {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://www.costco.co.kr/Food/Snack/c/cos_10.5").get();
			Elements hotdeal = doc.select(".product-listing.product-grid");
			Elements deal = hotdeal.select("li");
			
			for(Element e : deal) {
				System.out.println(e.text());
			}
			System.out.println("------------------------------1������------------------------------------------");
		}catch (IOException e) {e.printStackTrace();
		}
	}
}
