package com.crawler.analysis;

import com.crawler.entity.TbAuthor;
import com.crawler.entity.json.Author;

public class EntityCompile {

	public static TbAuthor comileAuthor(Author author) {
		TbAuthor tbAuthor = new TbAuthor();
		// 获取id
		String channel_id = author.getChannel_id();
		// 移除 id前面的m
		channel_id = channel_id.substring(1, channel_id.length());
		// 设置id
		tbAuthor.setId(Integer.valueOf(channel_id));
		// 订阅人数
		String bookcount = author.getBookcount();
		// 去除最后订阅两个字
		bookcount = bookcount.substring(0, bookcount.length() - 3);
		// 设置订阅人数
		tbAuthor.setBookCount(Integer.valueOf(bookcount));
		tbAuthor.setChannelImage(author.getChannel_image());

		tbAuthor.setChannelName(author.getChannel_name());

		tbAuthor.setChannelSummary(author.getChannel_summary());
		tbAuthor.setChannelType(author.getChannel_type());
		tbAuthor.setMediaDomain(author.getChannel_media().getMedia_domain());
		return tbAuthor;
	}

}
