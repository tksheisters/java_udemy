package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	private Date moment;
	private String tittle;
	private String content;
	private Integer likes;
	private List<Comment> comments = new ArrayList<>();

	public Post(Date moment, String tittle, String content, Integer likes) {
		this.moment = moment;
		this.tittle = tittle;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	
	public List<Comment> getComments() {
		return comments;
	}


	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(tittle + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Comment comment : comments) {
			sb.append(comment.getText() + "\n");
		}
		return sb.toString();
	}

}
