package com.dto;

public class BbsDTO {

	private int bbsID;
	private String bbsTitle;
	private String userid;
	private String bbsDate;
	private String bbsContent;
	private int bbsAvailable;

	public BbsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BbsDTO(int bbsID, String bbsTitle, String userid, String bbsDate, String bbsContent, int bbsAvailable) {
		super();
		this.bbsID = bbsID;
		this.bbsTitle = bbsTitle;
		this.userid = userid;
		this.bbsDate = bbsDate;
		this.bbsContent = bbsContent;
		this.bbsAvailable = bbsAvailable;
	}

	public int getBbsID() {
		return bbsID;
	}

	public void setBbsID(int bbsID) {
		this.bbsID = bbsID;
	}

	public String getBbsTitle() {
		return bbsTitle;
	}

	public void setBbsTitle(String bbsTitle) {
		this.bbsTitle = bbsTitle;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getBbsDate() {
		return bbsDate;
	}

	public void setBbsDate(String bbsDate) {
		this.bbsDate = bbsDate;
	}

	public String getBbsContent() {
		return bbsContent;
	}

	public void setBbsContent(String bbsContent) {
		this.bbsContent = bbsContent;
	}

	public int getBbsAvailable() {
		return bbsAvailable;
	}

	public void setBbsAvailable(int bbsAvailable) {
		this.bbsAvailable = bbsAvailable;
	}

	@Override
	public String toString() {
		return "BoardDTO [bbsID=" + bbsID + ", bbsTitle=" + bbsTitle + ", userid=" + userid + ", bbsDate=" + bbsDate
				+ ", bbsContent=" + bbsContent + ", bbsAvailable=" + bbsAvailable + "]";
	}

}
