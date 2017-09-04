package com.crawler.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TbAuthor {

	@Id
	private Integer id;

	@Column(columnDefinition = "int COMMENT '订阅人数'")
	private Integer bookCount;

	@Column(columnDefinition = "varchar(200) COMMENT '姓名'")
	private String channelName;

	@Column(columnDefinition = "varchar(500) COMMENT '简介'")
	private String channelSummary;

	@Column(columnDefinition = "varchar(500) COMMENT '头像url'")
	private String channelImage;

	@Column(columnDefinition = "varchar(500) COMMENT '父类型'")
	private String channelType;

	@Column(columnDefinition = "varchar(500) COMMENT '子类型'")
	private String mediaDomain;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getBookCount() {
		return bookCount;
	}

	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getChannelSummary() {
		return channelSummary;
	}

	public void setChannelSummary(String channelSummary) {
		this.channelSummary = channelSummary;
	}

	public String getChannelImage() {
		return channelImage;
	}

	public void setChannelImage(String channelImage) {
		this.channelImage = channelImage;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getMediaDomain() {
		return mediaDomain;
	}

	public void setMediaDomain(String mediaDomain) {
		this.mediaDomain = mediaDomain;
	}

	@Override
	public String toString() {
		return "TbAuthor [id=" + id + ", bookCount=" + bookCount + ", channelName=" + channelName + ", channelSummary="
				+ channelSummary + ", channelImage=" + channelImage + ", channelType=" + channelType + ", mediaDomain="
				+ mediaDomain + "]";
	}

}
