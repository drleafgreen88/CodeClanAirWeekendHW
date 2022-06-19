public class Pilot extends CabinCrewMember {

    private String pilotLicenseNumber;

    public Pilot(String name, Rank rank, String pilotLicenseNumber) {
        super(name, rank);
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String getPilotLicenseNumber() {
        return pilotLicenseNumber;
    }
}
