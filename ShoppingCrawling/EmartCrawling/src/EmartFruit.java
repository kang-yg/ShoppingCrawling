import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class EmartFruit {
	public static void main(String[] args) {
		String page = "3";
		try {
			Document doc = Jsoup.connect(
					"http://emart.ssg.com/disp/category.ssg?dispCtgId=0006110002&page=" + page + "&pageSize=80&mallGb=1&brandIds=&benefit=&shpp=&cls=&salestrNo=&pickuSalestr=&clipSizeYn=&sizeIds=&viewType=&minsellPrc=&maxsellPrc=&prc=&sort=&brandMoreYn=&benefitMoreYn=")
					.get();
			Elements hotdeal = doc.select(".tmpl_itemlist");
			Elements deal = hotdeal.select("li");

			for (Element e : deal) {
				System.out.println(e.text());
			}
			System.out.println("------------------------------1������------------------------------------------");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
