package org.example.prototype;

public class CarModel extends Model3D {
    public CarModel(int taille, String couleur, String texture) {
        super(taille, couleur, texture);
    }

    @Override
    public ShapePrototype clone() {
        return new CarModel(this.getTaille(), this.getCouleur(), this.getTexture());
    }
}
