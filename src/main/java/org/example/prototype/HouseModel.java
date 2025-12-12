package org.example.prototype;

public class HouseModel extends Model3D {

    public HouseModel(int taille, String couleur, String texture) {
        super(taille, couleur, texture);
    }

    @Override
    public ShapePrototype clone() {
        return new HouseModel(this.getTaille(), this.getCouleur(), this.getTexture());
    }
}