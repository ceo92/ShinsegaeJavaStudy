package classassignment;

public class TestMovie {
 
	public static void main(String[] args) { 
		Movie myMovie = new Movie();
		myMovie.setTitle("어거스트 러쉬");
		myMovie.setGenre("Drama");
		myMovie.play();
		
		System.out.println("--------------------");
		
		Movie yourMovie = new Movie();
		yourMovie.setTitle("나는 전설이다");
		yourMovie.setGenre("SF");
		yourMovie.play();
	}

}

class Movie{


	private String title;
	private String genre;


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void play(){
		System.out.println(getTitle()+"("+getGenre()+")"+ " 상영중입니다.");
	}

}
