import java.util.;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9cd4438e-e052-4683-aa15-25be19e6d28c")
public class Equipe {
    @objid ("c505e1ca-3237-4cd4-9d67-b405d7807213")
    private String nomEquipe;

    @objid ("d4566473-eab4-4b04-835c-d280c0bd0333")
    private ArrayList nbMatchGagne;

    @objid ("974d1841-c960-48df-95c4-d4829bfadff7")
    private Integer nbBut;

    @objid ("bbfd209f-9059-48ac-b7e4-f326fd64320d")
    String getNomEquipe() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nomEquipe;
    }

    @objid ("566136ca-1e87-4f34-8db2-92a3dd69dec6")
    void setNomEquipe(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nomEquipe = value;
    }

    @objid ("bf7f7f06-75f3-454a-9cf7-244906d9b888")
    ArrayList getNbMatchGagne() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbMatchGagne;
    }

    @objid ("5eaf2249-69e8-48d4-bbe2-290e94c99333")
    void setNbMatchGagne(ArrayList value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbMatchGagne = value;
    }

    @objid ("0f5ca3da-a4c3-43df-843f-9291ff379270")
    Integer getNbBut() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nbBut;
    }

    @objid ("efed95fa-c26a-45fd-b76e-ecd11f28c1a7")
    void setNbBut(Integer value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nbBut = value;
    }

}
