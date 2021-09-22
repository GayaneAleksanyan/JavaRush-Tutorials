package com.threadsImageReaderFactory;

import com.threadsImageReaderFactory.common.ImageReader;
import com.threadsImageReaderFactory.common.ImageTypes;

/* 
Factory method pattern
*/

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
