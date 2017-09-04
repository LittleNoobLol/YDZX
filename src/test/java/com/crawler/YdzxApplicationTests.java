package com.crawler;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.crawler.analysis.EntityCompile;
import com.crawler.constant.HeaderConstant;
import com.crawler.entity.TbAuthor;
import com.crawler.entity.json.Author;
import com.crawler.entity.json.Result;
import com.crawler.url.YDZX;
import com.crawler.util.HttpClientUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YdzxApplicationTests {

	@Test
	public void Athor() throws Exception {
		for (int i = 111112; i < 2000000; i++) {
			try{
			String json = HttpClientUtil.get(YDZX.getAuthor(i, 0), HeaderConstant.header);
			System.out.println(json);
			
			TbAuthor comileAuthor = EntityCompile.comileAuthor(json);
			System.out.println(comileAuthor.toString());
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(i+"页无人");
			}
		}

	}

}
