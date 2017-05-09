package java1702.javase.Multithreading;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;



import java.io.IOException;
import java.lang.annotation.Documented;

/**
 * Created by $qiqi
 * on 2017/5/9.
 * java
 */
public class Spider {
    public static void main(String[] args) throws IOException {
        String url = "http://bj.lianjia.com/ershoufang/dongcheng/";
        Document document = Jsoup.connect(url).get();

        Elements elements=document.select("li[class=clear]");
        for (Element element : elements) {
            String region = element.select("a[data-el=region]").get(0).text();
            String totalprice=element.select("div[class=totalPrice]").first().text();
//            Element houseInfo=element.select("div[class=houseInfo]").first();
//            for (Element element1 : elements) {
//                    if (Node  instanceof TextNode) {
//                        System.out.println(Node.toString());
//                    }
//            }
//            System.out.println("小区：" + region + "；总价：" + totalprice);
            System.out.println(region);
        }
    }
}
