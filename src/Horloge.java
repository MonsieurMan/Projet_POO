import iut.Game;
import iut.Objet;

/**
 * Created by MrMan on 30/05/2016.
 */
public class Horloge extends Objet {
    public Horloge(Game g, String nom, double _x, double _y) {
        super(g, nom, _x, _y);
    }

    @Override
    public boolean collision(Objet objet) {
        return false;
    }

    @Override
    public void effect(Objet objet) {

    }

    @Override
    public boolean isFriend() {
        return false;
    }

    @Override
    public boolean isEnnemy() {
        return false;
    }

    @Override
    public void move(long l) {

    }
}
