import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie>
{
	private int year;
	public Movie(int year, String name, double rating) {
		super();
		this.year = year;
		this.name = name;
		this.rating = rating;
	}
	private String name;
	private double rating;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public int compareTo(Movie o) {
		
        int isRatingComaprison = Double.compare(this.rating, o.rating);
        System.out.println("com::"+isRatingComaprison);
        if (isRatingComaprison == 0)//Salaries are equal use name as comparison criteria
        {
            //lhs name comparison with rhs name
            return name.compareTo(o.name);
        }
        //Now if rating are not equal, return comparison of reting
        return isRatingComaprison;

	}
}

class Rating implements Comparator<Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
		
		if(m1.getRating()>m2.getRating())
			return 1;
		else if(m2.getRating()>m1.getRating())
		return -1;
		else return 0;
	}
}

class Comparable_Test
{
	public static void main(String[] args) {
		
		ArrayList<Movie>ll=new ArrayList<Movie>() ;
		ll.add(new Movie(2001,"Shole",4.5));
		ll.add(new Movie(2011,"Aag",3.5));
		ll.add(new Movie(2010,"Dilwale",2.5));
		ll.add(new Movie(2010,"Khaan",4.5));
		
		ll.sort(Comparator.comparing(Movie::getRating).thenComparing(Movie::getName));
         for(Movie movie:ll)
         {
        	 System.out.println("Here :"+movie.getRating()+":"+movie.getName());
         }
		Collections.sort(ll);
		
		
		
		System.out.println("using Comparable");
		System.out.println("*********************");
		for (Movie movie : ll) {
		System.out.println(movie.getName()+"	:"+movie.getYear());
		}
		
		System.out.println("using Comparator");
		System.out.println("*********************");
		Rating rating =new Rating();
		Collections.sort(ll,rating);
		for (Movie movie : ll) {
			System.out.println(movie.getName()+"	:"+movie.getRating());
			}
		
		//Using Java 8
		
		
				ll.sort(Comparator.comparing(Movie::getRating).thenComparing(Movie::getName));
				System.out.println("Using Java 8 the best way::");
				
				for(Movie movie:ll)
				{
					System.out.println(movie.getName()+":   :"+movie.getRating());
				}
			
	}
	
	}