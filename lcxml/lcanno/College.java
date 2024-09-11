package com.mph.lcanno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class College {
     private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "College [id=" + id + "]";
	}
     @PostConstruct
     public void initCollege() {
    	 System.out.println("from init");
     }
     @PreDestroy
     public void destroyCollege() {
    	 System.out.println("from farzi destroyer....");
     }
}
