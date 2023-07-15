package com.rhyno.club.document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "account")
public class Account {
	@Id
	private String Id;

	private String clubId;

	private String pwd;

	private LocalDateTime lastModified;

	public Account() {
		super();
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}



	public String getClubId() {
		return clubId;
	}

	public void setClubId(String clubId) {
		this.clubId = clubId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public LocalDateTime getLastModified() {
		return lastModified;
	}

	public void setLastModified(LocalDateTime lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public String toString() {
		return "Account [clubId=" + clubId + ", pwd=" + pwd + ", lastModified=" + lastModified + "]";
	}

}
