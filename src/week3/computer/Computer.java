package week3.computer;

public class Computer {
    private String manufacturerName;
    private int processorSpeedMHz;
    private int ramSizeGB;
    private int hardDriveSizeGB;
    private int numUsbPorts;
    private double screenSizeInches;
    private String computerType;
    private boolean preinstalledOperatingSystem;
    private double purchasePrice;
    private double sellingPrice;

    // Constructors
    public Computer() {
    }

    public Computer(String manufacturerName, double screenSizeInches, boolean preinstalledOperatingSystem) {
        this.manufacturerName = manufacturerName;
        this.screenSizeInches = screenSizeInches;
        this.preinstalledOperatingSystem = preinstalledOperatingSystem;
    }

    public Computer(String manufacturerName, int processorSpeedMHz, int ramSizeGB, int hardDriveSizeGB, int numUsbPorts, String computerType, double screenSizeInches, boolean preinstalledOperatingSystem, double purchasePrice, double sellingPrice) {
        this.manufacturerName = manufacturerName;
        this.processorSpeedMHz = processorSpeedMHz;
        this.ramSizeGB = ramSizeGB;
        this.hardDriveSizeGB = hardDriveSizeGB;
        this.numUsbPorts = numUsbPorts;
        this.computerType = computerType;
        this.screenSizeInches = screenSizeInches;
        this.preinstalledOperatingSystem = preinstalledOperatingSystem;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    // Getters and Setters
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getProcessorSpeedMHz() {
        return processorSpeedMHz;
    }

    public void setProcessorSpeedMHz(int processorSpeedMHz) {
        this.processorSpeedMHz = processorSpeedMHz;
    }

    public int getRamSizeGB() {
        return ramSizeGB;
    }

    public void setRamSizeGB(int ramSizeGB) {
        this.ramSizeGB = ramSizeGB;
    }

    public int getHardDriveSizeGB() {
        return hardDriveSizeGB;
    }

    public void setHardDriveSizeGB(int hardDriveSizeGB) {
        this.hardDriveSizeGB = hardDriveSizeGB;
    }

    public int getNumUsbPorts() {
        return numUsbPorts;
    }

    public void setNumUsbPorts(int numUsbPorts) {
        this.numUsbPorts = numUsbPorts;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }

    public void setScreenSizeInches(double screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
    }

    public String getComputerType() {
        return computerType;
    }

    public void setComputerType(String computerType) {
        this.computerType = computerType;

    }

    public boolean isPreinstalledOperatingSystem() {
        return preinstalledOperatingSystem;
    }

    public void setPreinstalledOperatingSystem(boolean preinstalledOperatingSystem) {
        this.preinstalledOperatingSystem = preinstalledOperatingSystem;
    }

     public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    // Method to double RAM
    public void performMemoryUpgrade() {
        this.ramSizeGB *= 2;
    }

    // Method to calculate profit
    public double calculateProfit() {
        return sellingPrice - purchasePrice;
    }

    // toString method
    @Override
    public String toString() {
        return "\n- manufacturerName=" + manufacturerName + '\n' +
                "- processorSpeedMHz=" + processorSpeedMHz + '\n' +
                "- ramSizeGB=" + ramSizeGB + '\n' +
                "- hardDriveSizeGB=" + hardDriveSizeGB + '\n' +
                "- numUsbPorts=" + numUsbPorts + '\n' +
                "- screenSizeInches=" + screenSizeInches + '\n' +
                "- computerType='" + computerType + '\n' +
                "- preinstalledOperatingSystem=" + preinstalledOperatingSystem + '\n';
    }

    // Method to calculate profit
    public double calculateProfitForEach() {
        return sellingPrice - purchasePrice;
    }
}
