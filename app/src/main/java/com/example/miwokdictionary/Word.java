package com.example.miwokdictionary;

/** Word represents a vocabulary class that the user wants to learn.
 *  It contains a default translation and a Miwok translation for that word.
*/

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    /**
     * @param defaultTranslation The default translation of the word in the user's preferred language.
     * @param miwokTranslation The translation of the same word in the Miwok language
     * @param audioResourceId The audio pronunciation of the same word in Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioResourceId = audioResourceId;
    }

    /**
     * @param defaultTranslation The default translation of the word in the user's preferred language.
     * @param miwokTranslation The translation of the same word in the Miwok language
     * @param imageResourceId The image resource id of the image associated with that particular word
     * @param audioResourceId The audio pronunciation of the same word in Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    // Get the Miwok translation of the word
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    // Get the default translation of the word
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get the image associated with the word
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Get the audio pronunciation associated with the word
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    // Return weather there is an image or not
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
