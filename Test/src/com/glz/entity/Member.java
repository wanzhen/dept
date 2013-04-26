package com.glz.entity;

public class Member {
    String ID;//会员编号
    String score;//积分
    
	public Member(String iD, String score) {
		super();
		ID = iD;
		this.score = score;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	 

}
