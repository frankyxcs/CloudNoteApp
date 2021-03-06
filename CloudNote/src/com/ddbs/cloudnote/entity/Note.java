package com.ddbs.cloudnote.entity;

import java.io.Serializable;

public class Note implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6479882189787418724L;
	public static int COMFIRMED = 1;
	public static int UNCOMFIRMED = 0;
	public static int NEWCREATE = -1111;
	private String title;
	private String content;
	private int id;
	private long time;
	private int comfirmed;
	public int getComfirmed() {
		return comfirmed;
	}
	public void setComfirmed(int comfirmed) {
		this.comfirmed = comfirmed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Note(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	public Note(){
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title;
	}
	
}
