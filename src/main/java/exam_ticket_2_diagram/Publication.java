package exam_ticket_2_diagram;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Arrays;

public class Publication {
    public String Title;
    protected String Summary;
    protected String[] keywords;
    protected ArrayList<Author> authors;
    protected Publisher publisher;
    public ArrayList<Publication> references;

    public String getBibliographic() {
        return "";
    }
}
