package com.udacity.image;

import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Service that tries to guess if an image displays a cat.
 */
public class FakeImageService implements ImageService{


    @Override
    public boolean imageContainsCat(BufferedImage image, float confidenceThreshhold) {
        return ThreadLocalRandom.current().nextBoolean();
    }
}
