import java.util.ArrayList;

public class BeanTest {
  public static void main(String[] args) {
    Album album1 = new Album(1,"Michael Jackson","Thiller",1982,"Pop/Rock/R&B", 47.3);
    Album album2 = new Album(2,"AC/DC","Back in Black", 1980, "Hard Rock",26.1);
    Album album3 = new Album(3,"Pink Floyd","The Dark Side f the Moon", 1973,"Progressive Rock",24.2);

    Author AnneRice = new Author();
    AnneRice.setId(1);
    AnneRice.setFirst_name("Anne");
    AnneRice.setLast_name("Rice");

    Author StephenKing = new Author();
    StephenKing.setId(2);
    StephenKing.setFirst_name("Stephen");
    StephenKing.setLast_name("King");

    ArrayList<Quote> quotes = new ArrayList<>();

    Quote quote1 = new Quote();
    quote1.setId(1);
    quote1.setContent("Either get busy living or get busy dying");
    quote1.setAuthor(StephenKing);

    Quote quote2 = new Quote();
    quote2.setId(2);
    quote2.setContent("Books are a uniquely portable magic");
    quote2.setAuthor(StephenKing);

    Quote quote3 = new Quote();
    quote3.setId(3);
    quote3.setContent("The only power that exists is inside ourselves");
    quote3.setAuthor(AnneRice);

    quotes.add(quote1);
    quotes.add(quote2);
    quotes.add(quote3);


    for(Quote quote : quotes){
      if(quote.getAuthor().getFirst_name().equalsIgnoreCase("Stephen"))
        System.out.println(quote.getContent() + " By " + quote.getAuthor().getFirst_name() + " " + quote.getAuthor().getLast_name());
    }





  }
}
