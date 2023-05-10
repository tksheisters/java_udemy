package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class App {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		
		Post post = new Post(sdf.parse("21/06/2020 15:34"), "Traveling", "I´m going to see you", 12);
		Comment com1 = new Comment("have a nice trip");
		Comment com2 = new Comment("wow thats awesome");
		post.addComment(com1);
		post.addComment(com2);
		

		System.out.println(post);

	}

}
