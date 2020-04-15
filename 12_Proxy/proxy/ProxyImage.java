package proxy;

public class ProxyImage implements Image {

	private final String filename;
	private String name;
    private RealImage image;
    
    /**
     * Constructor
     * @param filename
     */
    public ProxyImage(String filename, String name) {
        this.filename = filename;
        this.name = name;
    }

    /**
     * Displays the image
     */
    @Override
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        }
        image.displayImage();
    }

	@Override
	public String showData() {
		return name;
	}

}
