package br.android.cericatto.tourguideapp.model;

/**
 * Establishment.java.
 *
 * @author Rodrigo Cericatto
 * @since Sep 29, 2016
 */
public class Establishment {

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------

    private int imageId;
    private int nameId;
    private int neighborhoodId;
    private int descriptionId;

    //--------------------------------------------------
    // Constructor
    //--------------------------------------------------

    public Establishment(int imageId, int nameId, int descriptionId, int neighborhoodId) {
        this.imageId = imageId;
        this.nameId = nameId;
        this.descriptionId = descriptionId;
        this.neighborhoodId = neighborhoodId;
    }

    //--------------------------------------------------
    // To String
    //--------------------------------------------------

    @Override
    public String toString() {
        return "Establishment{" +
            "imageId=" + imageId +
            ", nameId=" + nameId +
            ", neighborhoodId=" + neighborhoodId +
            ", descriptionId=" + descriptionId +
            '}';
    }

    //--------------------------------------------------
    // Getters and Setters
    //--------------------------------------------------

    public int getImageId() {
        return imageId;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getNameId() {
        return nameId;
    }
    public void setNameId(int nameId) {
        this.nameId = nameId;
    }

    public int getNeighborhoodId() {
        return neighborhoodId;
    }
    public void setNeighborhoodId(int neighborhoodId) {
        this.neighborhoodId = neighborhoodId;
    }

    public int getDescriptionId() {
        return descriptionId;
    }
    public void setDescriptionId(int descriptionId) {
        this.descriptionId = descriptionId;
    }
}