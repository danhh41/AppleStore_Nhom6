package OfficialVersion;

public abstract class Model implements Displayable, Searchable {

    private String type;
    private String id;
    private String name;

    private String screenSize;
    private String displayTechnology;
    private String resolution;
    private int refreshRate;

    private String cpu;
    private String gpu;
    private int ram;
    private String storage;
    private String os;

    private String connectivity;
    private String weight;
    private String launchDate;
    private double price;

    public Model() {
    }

    public Model(String type, String id, String name, String screenSize,
            String displayTechnology, String resolution, int refreshRate,
            String cpu, String gpu, int ram, String storage, String os,
            String connectivity, String weight, String launchDate, double price) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.screenSize = screenSize;
        this.displayTechnology = displayTechnology;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.connectivity = connectivity;
        this.weight = weight;
        this.launchDate = launchDate;
        this.price = price;
    }

    public abstract void discountPrice(double percentage);

    public double applyDiscount(double percentage) {
        double saved = this.price * percentage / 100.0;
        this.price = this.price - saved;
        return saved;
    }

    public static String formatPrice(double p) {
        String s = String.valueOf(Math.round(p));
        StringBuilder sb = new StringBuilder();
        int start = s.length() % 3;
        if (start > 0) {
            sb.append(s, 0, start);
        }
        for (int i = start; i < s.length(); i += 3) {
            if (sb.length() > 0) {
                sb.append('.');
            }
            sb.append(s, i, i + 3);
        }
        return sb.toString() + " vnd";
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreenSize() {
        return this.screenSize;
    }

    public void setScreenSize(String s) {
        this.screenSize = s;
    }

    public String getDisplayTechnology() {
        return this.displayTechnology;
    }

    public void setDisplayTechnology(String s) {
        this.displayTechnology = s;
    }

    public String getResolution() {
        return this.resolution;
    }

    public void setResolution(String s) {
        this.resolution = s;
    }

    public int getRefreshRate() {
        return this.refreshRate;
    }

    public void setRefreshRate(int r) {
        this.refreshRate = r;
    }

    public String getCpu() {
        return this.cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return this.gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return this.storage;
    }

    public void setStorage(String s) {
        this.storage = s;
    }

    public String getOs() {
        return this.os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getConnectivity() {
        return this.connectivity;
    }

    public void setConnectivity(String s) {
        this.connectivity = s;
    }

    public String getWeight() {
        return this.weight;
    }

    public void setWeight(String w) {
        this.weight = w;
    }

    public String getLaunchDate() {
        return this.launchDate;
    }

    public void setLaunchDate(String s) {
        this.launchDate = s;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + this.id + ", name=" + this.name
                + ", refreshRate=" + this.refreshRate + "Hz"
                + ", ram=" + this.ram + "GB"
                + ", price=" + formatPrice(price);
    }

    @Override
    public boolean matchesQuery(String query) {
        String q = query.toLowerCase();
        return (this.name != null && this.name.toLowerCase().contains(q))
                || (this.type != null && this.type.toLowerCase().contains(q))
                || (this.cpu != null && this.cpu.toLowerCase().contains(q))
                || (this.os != null && this.os.toLowerCase().contains(q));
    }
}
