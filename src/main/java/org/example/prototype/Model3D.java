package org.example.prototype;

public class Model3D implements ShapePrototype {
    private int taille;
    private String couleur;
    private String texture;

    public Model3D(int taille, String couleur, String texture) {
        this.taille = taille;
        this.couleur = couleur;
        this.texture = texture;
    }


    public int getTaille() { return taille; }
    public void setTaille(int taille) { this.taille = taille; }

    public String getCouleur() { return couleur; }
    public void setCouleur(String couleur) { this.couleur = couleur; }

    public String getTexture() { return texture; }
    public void setTexture(String texture) { this.texture = texture; }

    @Override
    public ShapePrototype clone() {
        return new Model3D(taille, couleur, texture);
    }

    @Override
    public String toString() {
        return " [Taille=" + taille + ", Couleur=" + couleur + ", Texture=" + texture + "]";
    }

}
