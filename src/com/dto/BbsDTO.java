package com.dto;

public class BbsDTO {

	private int bbsnum;
	private String bbstitle;
	private String userid;
	private String bbsdate;
	private String bbscontent;
	private int bbsavailable;

	public BbsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BbsDTO(int bbsnum, String bbstitle, String userid, String bbsdate, String bbscontent, int bbsavailable) {
		super();
		this.bbsnum = bbsnum;
		this.bbstitle = bbstitle;
		this.userid = userid;
		this.bbsdate = bbsdate;
		this.bbscontent = bbscontent;
		this.bbsavailable = bbsavailable;
	}

	public int getBbsnum() {
		return bbsnum;
	}

	public void setBbsnum(int bbsnum) {
		this.bbsnum = bbsnum;
	}

	public String getBbstitle() {
		return bbstitle;
	}

	public void setBbstitle(String bbstitle) {
		this.bbstitle = bbstitle;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getBbsdate() {
		return bbsdate;
	}

	public void setBbsdate(String bbsdate) {
		this.bbsdate = bbsdate;
	}

	public String getBbscontent() {
		return bbscontent;
	}

	public void setBbscontent(String bbscontent) {
		this.bbscontent = bbscontent;
	}

	public int getBbsavailable() {
		return bbsavailable;
	}

	public void setBbsavailable(int bbsavailable) {
		this.bbsavailable = bbsavailable;
	}

	@Override
	public String toString() {
		return "BbsDTO [bbsnum=" + bbsnum + ", bbstitle=" + bbstitle + ", userid=" + userid + ", bbsdate=" + bbsdate
				+ ", bbscontent=" + bbscontent + ", bbsavailable=" + bbsavailable + "]";
	}

}
