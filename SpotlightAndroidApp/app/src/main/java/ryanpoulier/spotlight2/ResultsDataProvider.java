package ryanpoulier.spotlight2;

/**
 * Created by ASUS on 24/02/2016.
 */
public class ResultsDataProvider {


    private String title;
    private String timestamp;
    private String ID;


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ResultsDataProvider(String title, String timestamp, String ID){
        this.title= title;
        this.timestamp= timestamp;
        this.ID= ID;

    }


}
