package com.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.crawler.analysis.EntityCompile;
import com.crawler.constant.HeaderConstant;
import com.crawler.dao.AuthorDao;
import com.crawler.entity.TbAuthor;
import com.crawler.url.YDZX;
import com.crawler.util.HttpClientUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YdzxApplicationTests {

	@Autowired
	AuthorDao authorDao;

	public void Details() throws Exception {

		String html = HttpClientUtil.get("http://www.yidianzixun.com/mp/content?id=33666510", HeaderConstant.header);
		Document doc = Jsoup.parse(html);
		Elements select = doc.select(".content-bd");

		System.out.println(select.html());

		System.out.println("text:" + select.text());
	}

	@Test
	public void Athor() throws Exception {
		for (int i = 133371; i < 2000000; i++) {
			try {
				System.out.print("当前是:"+i+":");
				String json = HttpClientUtil.get(YDZX.getAuthor(i, 0), HeaderConstant.header);
				TbAuthor comileAuthor = EntityCompile.comileAuthor(json);
				if (comileAuthor != null) {
					System.out.println(comileAuthor.toString());
					authorDao.save(comileAuthor);
				}else{
					System.out.println("为空");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
