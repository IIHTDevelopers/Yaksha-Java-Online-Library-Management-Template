package com.onlinelibrarymanagement.model;

public class Book {
	private int id;

	private String name;

	private int subjectId;

	private String ISBN;

	private boolean isIssued;

	public Book() {
		super();
	}

	public Book(int id, String name, int subjectId, String iSBN, boolean isIssued) {
		super();
		this.id = id;
		this.name = name;
		this.subjectId = subjectId;
		ISBN = iSBN;
		this.isIssued = isIssued;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public boolean isIssued() {
		return isIssued;
	}

	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", subjectId=" + subjectId + ", ISBN=" + ISBN + ", isIssued="
				+ isIssued + "]";
	}

}
