import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class EmartFruit {
	public static void main(String[] args) {
		String mark = "------------------------------";
		try {
			System.out.println(mark + "행사중인 상품" + mark);
			Document doc = Jsoup.connect("http://emart.ssg.com/category/main.ssg?dispCtgId=0006110000").get();
			Elements hotdeal = doc.select(".ctmpl_gs");
			Elements deal = hotdeal.select(".cunit_info");
			for (Element e : deal) {
				System.out.println(e.text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(mark + "베스트 상품" + mark);
			Document doc = Jsoup.connect("http://emart.ssg.com/category/main.ssg?dispCtgId=0006110000").get();
			Elements hotdeal = doc.select(".ctmpl_gs_wrap .tit + .cunit_lst_v");
			Elements deal = hotdeal.select(".cunit_info");
			for (Element e : deal) {
				System.out.println(e.text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
