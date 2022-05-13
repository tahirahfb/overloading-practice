public class TvShow {
    private String showName;
    private int numOfEpisodes;
    private String genre;

    public TvShow(){}

    public TvShow(String showName){
        this.showName = showName;
    }

    public TvShow(String showName, int numOfEpisodes){
        this.showName = showName;
        this.numOfEpisodes = numOfEpisodes;
    }

    public TvShow(String showName, String genre){
        this.showName = showName;
        this.genre = genre;
    }

    public TvShow(int numOfEpisodes){
        this.numOfEpisodes = numOfEpisodes;
    }

    public TvShow(int numOfEpisodes, String genre){
        this.numOfEpisodes = numOfEpisodes;
        this.genre = genre;
    }

    public TvShow(String showName, int numOfEpisodes, String genre) {
        this.showName = showName;
        this.numOfEpisodes = numOfEpisodes;
        this.genre = genre;
    }

    public String getShowName(){
        return showName;
    }

    public void setShowName(String showName){
        this.showName = showName;
    }

    public int getNumOfEpisodes(){
        return numOfEpisodes;
    }

    public void setNumOfEpisodes(int numOfEpisodes){
        this.numOfEpisodes = numOfEpisodes;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    @Override

    public String toString(){
        return "The name of the show is " + getShowName() + " with " + getNumOfEpisodes() + " number of episodes. The genre is " + getGenre() + ".";
    }
}
