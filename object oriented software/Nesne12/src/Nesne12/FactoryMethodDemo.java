package Nesne12;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No image file provided.");
            return;
        }

        DecodedImage decodedImage;
        ImageReader reader = null;
        String image = args[0];
        String format = image.substring(image.indexOf('.') + 1);

        if (format.equals("gif")) {
            reader = new GifReader(image);
        } else if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        } else {
            System.out.println("Unsupported image format: " + format);
            return;
        }

        assert reader != null;
        decodedImage = reader.getDecodeImage();
        System.out.println(decodedImage);
    }
}
