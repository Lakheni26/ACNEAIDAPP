public class AcneAid {
    private String acneArea;
    private int waterIntake;
    private int faceWashTimes;

    // Constructor to initialize user data
    public AcneAid(String acneArea, int waterIntake, int faceWashTimes) {
        this.acneArea = acneArea;
        this.waterIntake = waterIntake;
        this.faceWashTimes = faceWashTimes;
    }

    // Method to recommend antibiotics based on the inputs
    public String recommendAntibiotic() {
        if (acneArea.equalsIgnoreCase("forehead") && waterIntake < 2 && faceWashTimes < 2) {
            return "Recommended Antibiotic: Doxycycline";
        } else if (acneArea.equalsIgnoreCase("cheeks") && waterIntake >= 2 && faceWashTimes >= 2) {
            return "Recommended Antibiotic: Minocycline";
        } else if (acneArea.equalsIgnoreCase("chin") && waterIntake < 2) {
            return "Recommended Antibiotic: Tetracycline";
        } else {
            return "No specific antibiotic recommendation. Consult a dermatologist.";
        }
    }

    // Getters and Setters for the fields (if needed)
    public String getAcneArea() {
        return acneArea;
    }

    public void setAcneArea(String acneArea) {
        this.acneArea = acneArea;
    }

    public int getWaterIntake() {
        return waterIntake;
    }

    public void setWaterIntake(int waterIntake) {
        this.waterIntake = waterIntake;
    }

    public int getFaceWashTimes() {
        return faceWashTimes;
    }

    public void setFaceWashTimes(int faceWashTimes) {
        this.faceWashTimes = faceWashTimes;
    }
}
