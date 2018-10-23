package fr.lille1.glp.helloworld;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Greeting {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String content;
    
    

	public Greeting() {	}

	public Greeting(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", content=" + content + "]";
	}
    
    
}
