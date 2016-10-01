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
    // Getters and Setters
    //--------------------------------------------------

    public int getImageId() {
        return imageId;
    }

    public int getNameId() {
        return nameId;
    }

    public int getNeighborhoodId() {
        return neighborhoodId;
    }

    public int getDescriptionId() {
        return descriptionId;
    }
}