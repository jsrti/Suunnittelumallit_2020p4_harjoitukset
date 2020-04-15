package proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Image> photoAlbum = new ArrayList<>();

        System.out.println("Creating a photo album and printing the photo names:");
        for (int i = 0; i < 5; i++) {
            Image image = new ProxyImage("image"+i, "photoName" + i);
            photoAlbum.add(image);
            System.out.println(image.showData());
        }
        
        System.out.println("\nBrowsing through the photos:\n");
        for(Image img : photoAlbum) {
            System.out.print(img.showData() + ":\n");
            img.displayImage();
            System.out.println();
        }
        
        System.out.println("\nRebrowsing loaded photos:\n");
        for(Image img : photoAlbum) {
            System.out.print(img.showData() + ":\n");
            img.displayImage();
            System.out.println();
        }

	}

}
