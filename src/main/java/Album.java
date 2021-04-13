import java.io.Serializable;

public class Album implements Serializable {
    private int id;
    private String artist;
    private String name_of_album;
    private int release_date;
    private String genre;
    private double sales;


  public Album() {
  }

  public Album(int id, String artist, String name_of_album, int release_date, String genre, double sales) {
    this.id = id;
    this.artist = artist;
    this.name_of_album = name_of_album;
    this.release_date = release_date;
    this.genre = genre;
    this.sales = sales;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getArtist() {
    return artist;
  }


  public void setArtist(String artist) {
    this.artist = artist;
  }


  public String getName_of_album() {
    return name_of_album;
  }

  public void setName_of_album(String name_of_album) {
    this.name_of_album = name_of_album;
  }

  public int getRelease_date() {
    return release_date;
  }

  public void setRelease_date(int release_date) {
    this.release_date = release_date;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public double getSales() {
    return sales;
  }

  public void setSales(double sales) {
    this.sales = sales;
  }
}
