package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String a, double b, int c, int d){
        movieName = a;
        rating=b;
        numRatings=c;
        revenue=d;
    }
    public void movieToString(){
        System.out.println("Movie: "+movieName);
        System.out.println("Rating: "+rating);
        System.out.println("Ratings: "+numRatings);
        System.out.println("Revenue: "+revenue);
        System.out.println("");
    }
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    public void addRating(double a){
        double newRating=a;
        double newTotal=rating*numRatings+newRating;
        numRatings++;
        double average = newTotal/numRatings;
        rating=average;
        
        return;
    }
    public double getRating(){
        return rating;
    }
    public boolean compareRatings(Movie mB){
        if(mB.getRating()>rating){
            return false;
        }
        else{
            return true;
        }
    }
    public String revenueToString(){
        int first3Digits=revenue/1000000;
        int remaining6 = revenue-first3Digits*1000000;
        int second3Digits = remaining6/1000;
        int last3Digits = remaining6-(second3Digits*1000);
        return first3Digits+","+second3Digits+","+last3Digits;
    }
    public Movie pirateMovie(){
        Movie mC = new Movie("Spirited Away",8.6,16,395800000);
        return mC;
    }

}
