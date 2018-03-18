package com.example.android.miwok;

import android.media.Image;

/**
 * Created by GOODLUCK on 3/6/2018.
 */

public class Word {

    //Default Translation for the word
    private String mDefaultTranslation;

    //Default Translation for the word
    private String mMiwokTranslation;

    //Image resource Declaration
    private int mImageResourceId;

    //Audio resource ID for each word
    private int mAudioResourceId;

    /***
     * this is the constructor to hold only phrases in our app
     * @param defaultTranslation
     * @param miwokTranslation
     * @param audioResourceId
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /***
     * this is the constructor to handle the other tree categories in our app
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceId
     * @param audioResourceId
     */
    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId ,int audioResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId = audioResourceId;

    }

    /***
     * DefaultTranslation method
     * @return String
     */
    public String getDefaultTranslation() {

        return mDefaultTranslation;
    }

    /***
     * MiwokTranslation Method of the word
     * @return String
     */
    public String getMiwokTranslation() {

        return mMiwokTranslation;
    }

    /***
     * ImageResource method definition
     * @return int
     */

    public int getImageResourceId(){

        return mImageResourceId;
    }

    /***
     * AudioResource method definition
     * @return int
     */
    public int getmAudioResourceId(){

        return mAudioResourceId;
    }

}
