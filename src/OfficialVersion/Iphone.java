package OfficialVersion;

public class Iphone extends Model {

    private String rearCamera;
    private String frontCamera;
    private String charging;
    private String port;
    private String waterResistance;
    private String dimensions;
    private String displayType;

    public Iphone() {
    }

    public Iphone(String rearCamera, String frontCamera, String charging, String port,
            String waterResistance, String dimensions, String displayType,
            String type, String id, String name, String screenSize,
            String displayTechnology, String resolution, int refreshRate,
            String cpu, String gpu, int ram, String storage, String os,
            String connectivity, String weight, String launchDate, double price) {
        super(type, id, name, screenSize, displayTechnology, resolution, refreshRate,
                cpu, gpu, ram, storage, os, connectivity, weight, launchDate, price);
        this.rearCamera = rearCamera;
        this.frontCamera = frontCamera;
        this.charging = charging;
        this.port = port;
        this.waterResistance = waterResistance;
        this.dimensions = dimensions;
        this.displayType = displayType;
    }

    @Override
    public void discountPrice(double percentage) {
        double originalPrice = getPrice();
        double saved = applyDiscount(percentage);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.printf("║  IPHONE DEAL: %-28s║%n", getName());
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.printf("║  Original price : %-23s║%n", formatPrice(originalPrice));
        System.out.printf("║  Discount       : -%-22s║%n",
                formatPrice(saved) + " (" + (int) percentage + "%)");
        System.out.printf("║  NEW PRICE      : %-23s║%n", formatPrice(getPrice()));
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println();
    }

    @Override
    public void showBasicInfo() {
        System.out.printf("%-25s | %s | %s | %dGB RAM | %s%n",
                getName(), getType().toUpperCase(),
                getCpu(), getRam(), formatPrice(getPrice()));
    }

    @Override
    public void showFullSpecs() {
        System.out.println("========== " + getName() + " ==========\n");
        System.out.println("Screen Size        : " + getScreenSize());
        System.out.println("Display Technology : " + getDisplayTechnology());
        System.out.println("Resolution         : " + getResolution());
        System.out.println("Refresh Rate       : " + getRefreshRate() + "Hz");
        System.out.println("Display Type       : " + displayType + "\n");
        System.out.println("Rear Camera        : " + rearCamera);
        System.out.println("Front Camera       : " + frontCamera + "\n");
        System.out.println("Chipset            : " + getCpu());
        System.out.println("GPU                : " + getGpu());
        System.out.println("RAM                : " + getRam() + "GB");
        System.out.println("Internal Storage   : " + getStorage());
        System.out.println("Operating System   : " + getOs() + "\n");
        System.out.println("Dimensions         : " + dimensions);
        System.out.println("Weight             : " + getWeight() + "\n");
        System.out.println("Charging           : " + charging);
        System.out.println("Port               : " + port);
        System.out.println("Water Resistance   : " + waterResistance);
        System.out.println("Connectivity       : " + getConnectivity() + "\n");
        System.out.println("Launch Date        : " + getLaunchDate());
        System.out.println("Price              : " + formatPrice(getPrice()) + "\n");
    }

    @Override
    public boolean matchesQuery(String query) {
        String q = query.toLowerCase();
        return super.matchesQuery(query)
                || (rearCamera != null && rearCamera.toLowerCase().contains(q))
                || (port != null && port.toLowerCase().contains(q));
    }

    public String getRearCamera() {
        return this.rearCamera;
    }

    public void setRearCamera(String s) {
        this.rearCamera = s;
    }

    public String getFrontCamera() {
        return this.frontCamera;
    }

    public void setFrontCamera(String s) {
        this.frontCamera = s;
    }

    public String getCharging() {
        return this.charging;
    }

    public void setCharging(String s) {
        this.charging = s;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String s) {
        this.port = s;
    }

    public String getWaterResistance() {
        return this.waterResistance;
    }

    public void setWaterResistance(String s) {
        this.waterResistance = s;
    }

    public String getDimensions() {
        return this.dimensions;
    }

    public void setDimensions(String s) {
        this.dimensions = s;
    }

    public String getDisplayType() {
        return this.displayType;
    }

    public void setDisplayType(String s) {
        this.displayType = s;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Iphone{" + super.toString()
                + ", rearCamera=" + this.rearCamera
                + ", frontCamera=" + this.frontCamera
                + ", port=" + this.port
                + ", waterResistance=" + this.waterResistance + "}";
=======
        return "Iphone{" + super.toString() + "rearCamera=" + this.rearCamera + ", frontCamera=" + this.frontCamera + ", charging=" + this.charging + ", port=" + this.port + ", waterResistance=" + this.waterResistance + ", dimensions=" + this.dimensions + ", displayType=" + this.displayType + '}';
    }
   
    @Override
    public void showBasicInfo() {
        System.out.println("========== " + getName() + " ==========\n");
        System.out.println("Screen Size: " + getScreenSize());
        System.out.println("Display Technology: " + getDisplayTechnology());
        System.out.println("Resolution: " + getResolution());
        System.out.println("Refresh Rate: " + getRefreshRate());
        System.out.println("Display Type: " + getDisplayType() + "\n");
        System.out.println("Rear Camera: " + getRearCamera());
        System.out.println("Front Camera: " + getFrontCamera() + "\n");
        System.out.println("Chipset: "+ getCpu());
        System.out.println("GPU: " + getGpu());
        System.out.println("Internal Storage: " + getStorage());
        System.out.println("Operating System: " + getOs() + "\n");
        System.out.println("Dimensions: " + getDimensions());
        System.out.println("Weight: " + getWeight() + "\n");
        System.out.println("Charging: " + getCharging());
        System.out.println("Port: " + getPort());
        System.out.println("Water Resistance: " + getWaterResistance());
        System.out.println("Connectivity: " + getConnectivity() + "\n");
        System.out.println("Launch Date: " + getLaunchDate() + "\n");
        System.out.println("Price: " + getPrice() + "\n\n");
>>>>>>> 841d40b05433b34795ad5356d502c805f538ee84
    }
}
