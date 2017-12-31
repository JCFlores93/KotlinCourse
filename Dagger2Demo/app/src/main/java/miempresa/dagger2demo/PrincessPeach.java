package miempresa.dagger2demo;

/**
 * Created by USUARIO on 22/07/2017.
 */

public class PrincessPeach {

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    private int name;
    private int photo;

    public PrincessPeach() {
        this.name = R.string.princess_name;
        this.photo = R.drawable.ic_peach;
    }
}
