package com.example.limmonica.tourguideapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * {@link Element} represents a city element like restaurant, place, event or park.
 * It contains resource IDs for the element name, element description, element image file
 * and optional address for that element.
 */
public class Element implements Parcelable {
    public static final Creator<Element> CREATOR = new Creator<Element>() {
        @Override
        public Element createFromParcel(Parcel in) {
            return new Element(in);
        }

        @Override
        public Element[] newArray(int size) {
            return new Element[size];
        }
    };
    /**
     * String resource ID for the name of the element (restaurant, event etc.)
     */
    private int mElementNameId;
    /**
     * String resource ID for the description of the element
     */
    private int mElementDescId;
    /**
     * String resource ID for the image of the element
     */
    private int mElementImgResId;

    /**
     * Create a new Element object.
     *
     * @param elementNameId   is the string resource ID for name of the element
     * @param elementDescId   is the string resource ID for the description of the element
     * @param elementImgResId is the drawable resource ID for the image associated with the element
     */
    Element(int elementNameId, int elementDescId, int elementImgResId) {
        mElementNameId = elementNameId;
        mElementDescId = elementDescId;
        mElementImgResId = elementImgResId;
    }

    private Element(Parcel in) {
        mElementNameId = in.readInt();
        mElementDescId = in.readInt();
        mElementImgResId = in.readInt();
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
    public int getElementImgResId() {
        return mElementImgResId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mElementNameId);
        parcel.writeInt(mElementDescId);
        parcel.writeInt(mElementImgResId);
    }
}
