package java1702.javase.house;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by $qiqi
 * on 2017/5/6.
 * java
 */
//public class Test {
//    private static final String[] AREA = {
//            "dongcheng",
//            "xicheng",
//            "chaoyang",
//            "haidian",
//            "fengtai",
//            "shijingshan",
//            "tongzhou",
//            "changping",
//            "daxing",
//            "yizhuangkaifaqu",
//            "shunyi",
//            "fangshan",
//            "mentougou",
//            "pinggu",
//            "huairou",
//            "miyun",
//            "yanqing",
//            "yanjiao"
//    };
//    private static final int[] PAGES = {
//            35,
//            35
//    };
//
//    private static final String DONGCHENG_URL = "http://bj.lianjia.com/ershoufang/";
//    private static final String IMAGE_REGEXP = "<div class=\"totalPrice\"><span>(\\d+)</span>";
//    private static int counter;
//
//    public static void main(String[] args) {
//        for (int i = 0; i < AREA.length; i++) {
//            counter = 0;
//            System.out.println(AREA[i]);
//            for (int j = 0; j < PAGES[i]; j++) {
//                try {
//                    getPage(j + 1, AREA[i]);
//                } catch (java.net.MalformedURLException e) {
//                    e.printStackTrace();
//                } catch (URISyntaxException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    public static void getPage(int page, String area) throws MalformedURLException, URISyntaxException {
//        URI url = new URI(DONGCHENG_URL + area + "/pg" + page);
//        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
//
//            try (BufferedReader bufferedWriter = new BufferedReader(new FileWriter("data/" + area))) {
//
//                String line;
//                Pattern pattern = Pattern.compile(IMAGE_REGEXP);
//                Matcher matcher;
//                while ((line = bufferedReader.readLine()) != null) {
//                    matcher = pattern.matcher(line);
//                    while (matcher.find()) {
//
//                        bufferedWriter.wait(Long.parseLong(matcher.group(1) + "\n"));
//                        System.out.println(++counter);
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
