package com.crawler.analysis;

import com.alibaba.fastjson.JSON;
import com.crawler.entity.TbAuthor;
import com.crawler.entity.json.Author;

public class EntityCompile {

	public static TbAuthor comileAuthor(String json) {
		// 转化对象
		Author author = JSON.parseObject(json, Author.class);
		if (author.getReason() != null) {
			return null;
		}

		TbAuthor tbAuthor = new TbAuthor();

		// 获取id
		String channel_id = author.getChannel_id();
		// 移除 id前面的m
		channel_id = channel_id.substring(1, channel_id.length());
		// 设置id
		tbAuthor.setId(Integer.valueOf(channel_id));
		// 订阅人数
		String bookcount = author.getBookcount();
		// 声明转换后的订阅人数
		int bookCount = 0;
		// 订阅人数没有超过1万
		if (bookcount.indexOf('.') == -1) {
			// 去除最后 人订阅 三个字
			bookcount = bookcount.substring(0, bookcount.length() - 3);
			bookCount = Integer.valueOf(bookcount);
		} else {
			// 去除最后 万人订阅 四个字
			bookcount = bookcount.substring(0, bookcount.length() - 4);
			Double valueOf = Double.valueOf(bookcount);
			// 强转int
			bookCount = (int) (valueOf * 10000);
		}

		// 设置订阅人数
		tbAuthor.setBookCount(bookCount);
		tbAuthor.setChannelImage(author.getChannel_image());
		tbAuthor.setChannelName(author.getChannel_name());
		tbAuthor.setChannelSummary(author.getChannel_summary());
		tbAuthor.setChannelType(author.getChannel_type());
		tbAuthor.setMediaDomain(author.getChannel_media().getMedia_domain());
		return tbAuthor;
	}

}
