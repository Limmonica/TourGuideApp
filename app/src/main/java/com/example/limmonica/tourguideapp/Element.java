package com.example.limmonica.tourguideapp;

/**
 * {@link Element} represents a city element like restaurant, place, event or park.
 * It contains resource IDs for the element name, element description, element image file
 * and optional address for that element.
 */
public class Element {
    /**
     * Constant value that represents no phone number was provided for this element
     */
    private static final int NO_VALUE_PROVIDED = -1;
    /**
     * String resource ID for the name of the element (restaurant, event etc.)
     */
    private int mElementNameId;
    /**
     * String resource ID for the description of the element
     */
    private int mElementDescId;
    /**
     * String resource ID for the logo image of the element
     */
    private int mElementLogoResId = NO_VALUE_PROVIDED;
    /**
     * String resource ID for the picture image of the element
     */
    private int mElementPicResId;
    /**
     * String resource ID for the phone number of the element
     */
    private int mElementPhoneId = NO_VALUE_PROVIDED;
    /**
     * String resource ID for the website address of the element
     */
    private int mElementWebId = NO_VALUE_PROVIDED;
    /**
     * String resource ID for the element address in order to get directions
     */
    private int mElementMapId;
    /**
     * String resource ID for the element Facebook address
     */
    private int mElementFbId = NO_VALUE_PROVIDED;

    /**
     * Create a new Element object for the Restaurants category.
     *  @param elementNameId    is the string resource ID for name of the element
     * @param elementDescId    is the string resource ID for the description of the element
     * @param elementLogoResId is the drawable resource ID for the logo associated with the element
     * @param elementPicResId  is the drawable resource ID for the picture associated with the element
     * @param elementPhoneId   is the string resource ID for the phone number of the element
     * @param elementWebId     is the string resource ID for the website address of the element
     * @param elementMapId     is the string resource ID for the element address
     */
    Element(int elementNameId, int elementDescId, int elementLogoResId, int elementPicResId,
            int elementPhoneId, int elementWebId, int elementMapId, int elementFbId) {
        mElementNameId = elementNameId;
        mElementDescId = elementDescId;
        mElementLogoResId = elementLogoResId;
        mElementPicResId = elementPicResId;
        mElementPhoneId = elementPhoneId;
        mElementWebId = elementWebId;
        mElementMapId = elementMapId;
        mElementFbId = elementFbId;
    }

    /**
     * Create a new Element object for the Places category.
     *
     * @param elementNameId   is the string resource ID for the name of the element
     * @param elementDescId   is the string resource ID for the description of the element
     * @param elementPicResId is the drawable resource ID for the picture of the element
     */
    Element(int elementNameId, int elementDescId, int elementPicResId, int elementMapId) {
        mElementNameId = elementNameId;
        mElementDescId = elementDescId;
        mElementPicResId = elementPicResId;
        mElementMapId = elementMapId;
    }

    /**
     * Create a new Element object for the Events category.
     *
     * @param elementNameId    is the string resource ID for the name of the element
     * @param elementDescId    is the string resource ID for the description of the element
     * @param elementLogoResId is the string resource ID for the logo of the element
     * @param elementPicResId  is the drawable resource ID for the picture of the element
     * @param elementWebId     is the string resource ID for the web address of the element
     * @param elementMapId     is the string resource ID for the element's address
     * @param elementFbId      is the string resource ID for the element's Facebook address
     */
    Element(int elementNameId, int elementDescId, int elementLogoResId, int elementPicResId,
            int elementWebId, int elementMapId, int elementFbId) {
        mElementNameId = elementNameId;
        mElementDescId = elementDescId;
        mElementLogoResId = elementLogoResId;
        mElementPicResId = elementPicResId;
        mElementWebId = elementWebId;
        mElementMapId = elementMapId;
        mElementFbId = elementFbId;
    }

    /**
     * Create a new Element object specific for the Parks category.
     *
     * @param elementNameId   is the string resource ID for the name of the element
     * @param elementDescId   is the string resource ID for the description of the element
     * @param elementPicResId is the drawable resource ID for the picture of the element
     * @param elementWebId    is the string resource ID for the web address of the element
     * @param elementMapId    is the string resource ID for the element's address
     */
    Element(int elementNameId, int elementDescId, int elementPicResId, int elementWebId,
            int elementMapId) {
        mElementNameId = elementNameId;
        mElementDescId = elementDescId;
        mElementPicResId = elementPicResId;
        mElementWebId = elementWebId;
        mElementMapId = elementMapId;
    }

    /**
     * Get the string resource ID for the element name
     */
    public int getElementNameId() {
        return mElementNameId;
    }

    /**
     * Get the string resource ID for the element description
     */
    public int getElementDescId() {
        return mElementDescId;
    }

    /**
     * Get the image resource ID of the element
     */
    public int getElementLogoResId() {
        return mElementLogoResId;
    }

    /**
     * Returns whether of not there is a logo image for the element
     */
    public boolean hasLogo() {
        return mElementLogoResId != NO_VALUE_PROVIDED;
    }

    /**
     * Get the drawable resource ID of the picture of the element
     */
    public int getElementPicResId() {
        return mElementPicResId;
    }

    /**
     * Get the string resource ID for the element phone number
     */
    public int getElementPhoneId() {
        return mElementPhoneId;
    }

    /**
     * Returns whether or not there is a phone number for the element
     */
    public boolean hasPhone() {
        return mElementPhoneId != NO_VALUE_PROVIDED;
    }

    /**
     * Get the string resource ID for the element web address
     */
    public int getElementWebId() {
        return mElementWebId;
    }

    /**
     * Returns whether or not there is a web address for the element
     */
    public boolean hasWeb() {
        return mElementWebId != NO_VALUE_PROVIDED;
    }

    /**
     * Get the string resource ID for the element directions
     */
    public int getElementMapId() {
        return mElementMapId;
    }

    /**
     * Get the string resource ID for the element Facebook page address
     */
    public int getElementFbId() {
        return mElementFbId;
    }

    /**
     * Returns whether of not there is a Facebook page address for the element
     */
    public boolean hasFb() {
        return mElementFbId != NO_VALUE_PROVIDED;
    }
}
