import java.util.ArrayList;

public class Etudiant {
    private int studentId;
    private String nom;
    private String email;
    private List<Cours> listeCours;




    public Etudiant ( int studentId , String nom , String email ){
        this.studentId=studentId;
        this.nom=nom;
        this.email=email;
        this.listeCours=new ArrayList<>();
    }
    public void inscrire(Cours c) {
        c.ajouterEtudiant(this);
        System.out.println("Étudiant" + nom + "inscrit dans le cours :" + c.gettitre());
    }
    public int getcourseId() {
        return courseId;
    }
    public String gettitre() {
        return titre;
    }
    public String getdescription() {
        return description;
    }
    public void afficherCours() {
        for (Cours c : listeCours) {
            System.out.println(c.gettitre());
        }

    }

}
