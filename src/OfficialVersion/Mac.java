package OfficialVersion;

public class Mac extends Model {

    private String battery;
    private String brightness;
    private String display;
    private String neuralEngine;

    public Mac() {
    }

    public Mac(String battery, String brightness, String display, String neuralEngine,
            String type, String id, String name, String screenSize,
            String displayTechnology, String resolution, int refreshRate,
            String cpu, String gpu, int ram, String storage, String os,
            String connectivity, String weight, String launchDate, double price) {
        super(type, id, name, screenSize, displayTechnology, resolution, refreshRate,
                cpu, gpu, ram, storage, os, connectivity, weight, launchDate, price);
        this.battery = battery;
        this.brightness = brightness;
        this.display = display;
        this.neuralEngine = neuralEngine;
    }

   
    @Override
    public void discountPrice(double percentage) {
        double originalPrice = getPrice();
        double saved = applyDiscount(percentage);   // updates stored price

        System.out.println("┌─────────────────────────────────────────┐");
        System.out.printf("│  MAC DEAL                                │%n");
        System.out.printf("│  Model    : %-29s│%n", getName());
        System.out.println("├─────────────────────────────────────────┤");
        System.out.printf("│  Was      : %-29s│%n", formatPrice(originalPrice));
        System.out.printf("│  You save : %-29s│%n",
                formatPrice(saved) + " (" + (int) percentage + "% off)");
        System.out.printf("│  Now      : %-29s│%n", formatPrice(getPrice()));
        System.out.println("└─────────────────────────────────────────┘");
        System.out.println();
    }

  
    @Override
    public void showBasicInfo() {
        System.out.printf("%-25s | %s | %s CPU | %dGB RAM | %s%n",
                getName(), getType().toUpperCase(),
                getCpu(), getRam(), formatPrice(getPrice()));
    }

 
    @Override
    public void showFullSpecs() {
        System.out.println("========== " + getName() + " ==========\n");
        System.out.println("CPU            : " + getCpu());
        System.out.println("GPU            : " + getGpu());
        System.out.println("Neural Engine  : " + neuralEngine + "\n");
        System.out.println("RAM            : " + getRam() + "GB");
        System.out.println("Storage        : " + getStorage() + "\n");
        System.out.println("Display        : " + getDisplayTechnology());
        System.out.println("Resolution     : " + getResolution());
        System.out.println("Brightness     : " + brightness);
        System.out.println("Refresh Rate   : " + getRefreshRate() + "Hz\n");
        System.out.println("Weight         : " + getWeight());
        System.out.println("Battery        : " + battery);
        System.out.println("Connectivity   : " + getConnectivity());
        System.out.println("OS             : " + getOs() + "\n");
        System.out.println("Price          : " + formatPrice(getPrice()) + "\n");
    }

    @Override
    public boolean matchesQuery(String query) {
        String q = query.toLowerCase();
        return super.matchesQuery(query)
                || (neuralEngine != null && neuralEngine.toLowerCase().contains(q))
                || (display != null && display.toLowerCase().contains(q));
    }

    // Getters & Setters
    public String getBattery() {
        return this.battery;
    }

    public void setBattery(String s) {
        this.battery = s;
    }

    public String getBrightness() {
        return this.brightness;
    }

    public void setBrightness(String s) {
        this.brightness = s;
    }

    public String getDisplay() {
        return this.display;
    }

    public void setDisplay(String s) {
        this.display = s;
    }

    public String getNeuralEngine() {
        return this.neuralEngine;
    }

    public void setNeuralEngine(String s) {
        this.neuralEngine = s;
    }

    @Override
    public String toString() {
        return "Mac{" + super.toString()
                + ", battery=" + this.battery
                + ", neuralEngine=" + this.neuralEngine
                + ", display=" + this.display + "}";
    }
}
