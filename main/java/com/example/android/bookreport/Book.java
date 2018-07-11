
package com.example.android.bookreport;


/**
 * An {@link Book} object contains information related to a single book.
 */
public class Book {

    /** Title of the book */
    private String mTitle;

    /** Author of the book */
    private String mAuthor;

    /** Description of the book */
    private String mDescription;

    /** PreviewLink of the book */
    private String mPreviewLink;


    /**
     * Constructs a new {@link Book} object.
     *  @param title is the title of the book
     * @param author is the author of the book
     * @param description is the brief description of the book
     * @param previewLink is the preview linK of the of the book
     */
    public Book(String title, String author, String description, String previewLink){
        mTitle = title;
        mAuthor = author;
        mDescription = description;
        mPreviewLink = previewLink;
    }

    /**
     * Returns the title of the book.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the author of the book.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the description of the book.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Returns the previewLink to find the preview of the book
     */
    public String getPreviewLink() {
        return mPreviewLink;
    }

}
