class SpaceAge {

    private double seconds;
    private double earthYears;
    private static final double ORBITAL_MERCURY = 0.2408467;
    private static final double ORBITAL_VENUS = 0.61519726;
    private static final double ORBITAL_EARTH = 1.0;
    private static final double ORBITAL_MARS = 1.8808158;
    private static final double ORBITAL_JUPITER = 11.862615;
    private static final double ORBITAL_SATURN = 29.447498;
    private static final double ORBITAL_URANUS = 84.016846;
    private static final double ORBITAL_NEPTUNE = 164.79132;

    SpaceAge(double seconds) {
        this.seconds = seconds;
        this.earthYears = seconds/60/60/24/365.25;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return this.earthYears / this.ORBITAL_EARTH;
    }

    double onMercury() {
        return this.earthYears / this.ORBITAL_MERCURY;
    }

    double onVenus() {
        return this.earthYears / this.ORBITAL_VENUS;
    }

    double onMars() {
        return this.earthYears / this.ORBITAL_MARS;
    }

    double onJupiter() {
        return this.earthYears / this.ORBITAL_JUPITER;
    }

    double onSaturn() {
        return this.earthYears / this.ORBITAL_SATURN;
    }

    double onUranus() {
        return this.earthYears / this.ORBITAL_URANUS;
    }

    double onNeptune() {
        return this.earthYears / this.ORBITAL_NEPTUNE;
    }

}
