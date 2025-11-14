import java.util.ArrayList;
import java.util.List;

public class Cours {
    private int courseId;
    private String titre;
    private String description;
    private Instructeur instructeur;
    private List<Etudiant> etudiants;

    public Cours ( int courseId , String titre , String description){
        this.courseId=courseId;
        this.titre =description;
        this.etudiants=new ArrayList<>();
    }
}
