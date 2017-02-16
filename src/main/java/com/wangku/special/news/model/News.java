/**
 * 
 */
package com.wangku.special.news.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Sunjian
 * @version 1.0
 * @since jdk1.7
 */
public class News implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	int targetid;
	@NotEmpty
    @Length(min = 5, max = 20, message = "标题长度必须位于5到20之间") 
	String title;
	@NotNull
    @Length(min = 5, max = 200, message = "内容长度必须位于5到200之间") 
	String content;
	int state;
	Date addtime=new Date();
	public final int getTargetid() {
		return targetid;
	}

	public final void setTargetid(int targetid) {
		this.targetid = targetid;
	}

	public final String getContent() {
		return content;
	}

	public final void setContent(String content) {
		this.content = content;
	}

	public final int getState() {
		return state;
	}

	public final void setState(int state) {
		this.state = state;
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getTitle() {
		return title;
	}

	public final void setTitle(String title) {
		this.title = title;
	}

	public final Date getAddtime() {
		return addtime;
	}

	public final void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("News [id=");
		builder.append(id);
		builder.append(", targetid=");
		builder.append(targetid);
		builder.append(", title=");
		builder.append(title);
		builder.append(", content=");
		builder.append(content);
		builder.append(", state=");
		builder.append(state);
		builder.append(", addtime=");
		builder.append(addtime);
		builder.append("]");
		return builder.toString();
	}

}
