package com.crawler.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TbDetails {

	@Id
	private Long id;
	@Column(columnDefinition = "int COMMENT '作者id'")
	private Integer AuthorId;
	@Column(columnDefinition = "datetime COMMENT '发布时间'")
	private Date date;
	@Column(columnDefinition = "varchar(500) COMMENT '标题'")
	private String title;
	@Column(columnDefinition = "varchar(500) COMMENT '加密后url后缀'")
	private String docid;
	@Column(columnDefinition = "varchar(100) COMMENT '分类'")
	private String ctype;
	@Column(columnDefinition = "int COMMENT '暂时未知分类'")
	private int dtype;
	@Column(columnDefinition = "varchar(500) COMMENT '简介'")
	private String summary;
	@Column(columnDefinition = "varchar(500) COMMENT '未加密的完整url'")
	private String url;
	@Column(columnDefinition = "text COMMENT '本文所拥有的图片'")
	private String images;
	@Column(columnDefinition = "text COMMENT '正文内容'")
	private String contextText;
	@Column(columnDefinition = "text COMMENT '正文内容带html标签'")
	private String contextHtml;

}
