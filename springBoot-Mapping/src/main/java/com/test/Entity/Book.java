package com.test.Entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
	@Table(name = "book")
	public class Book {
		 @Id
		    @GeneratedValue(strategy = GenerationType.AUTO)
		    private int bookId;
		    @Column(name = "Book_Name")
		    private String bookName;
		    @OneToMany(fetch = FetchType.EAGER, mappedBy = "Book", cascade = CascadeType.ALL)
		    @JsonIgnoreProperties("book")
		    private List<Story> storyList = new ArrayList<>();
		    public int getBookId() {
		        return bookId;
		    }
		    public void setBookId(int bookId) {
		        this.bookId = bookId;
		    }
		    public String getBookName() {
		        return bookName;
		    }
		    public void setBookName(String bookName) {
		        this.bookName = bookName;
		    }
		    public List<Story> getStoryList() {
		        return storyList;
		    }
		    public void setStoryList(List<Story> storyList) {
		        this.storyList = storyList;
		    }


	}

