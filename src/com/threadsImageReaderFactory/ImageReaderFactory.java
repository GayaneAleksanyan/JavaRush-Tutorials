package com.threadsImageReaderFactory;

import com.threadsImageReaderFactory.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes types) throws IllegalArgumentException {

        ImageReader reader;
        if(types == null) {
            throw new IllegalArgumentException();
        }
        switch (types) {
            case JPG:
                reader = new JpgReader();
                break;
            case BMP:
                reader = new BmpReader();
                break;
            case PNG:
                reader = new PngReader();
                break;
            default:
                throw new IllegalArgumentException();

        } return reader;
    }
}
