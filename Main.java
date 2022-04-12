package com.codeearthage;
import java.time.Duration;
public class Main {
    public static void main(String[] args) {}
}
class SpaceAge {
    /*
        Given an age in seconds, calculate how old someone would be on:

            Earth: orbital period 365.25 Earth days, or 31557600 seconds
            Mercury: orbital period 0.2408467 Earth years
            Venus: orbital period 0.61519726 Earth years
            Mars: orbital period 1.8808158 Earth years
            Jupiter: orbital period 11.862615 Earth years
            Saturn: orbital period 29.447498 Earth years
            Uranus: orbital period 84.016846 Earth years
            Neptune: orbital period 164.79132 Earth years

        So if you were told someone were 1,000,000,000 seconds old, you should be able to say that they're 31.69 Earth-years old.

        This program is to display the age of a person given in seconds in Earth years
        */
    private final long earthYear = 31557600L;
    private final double mercuryYear = earthYear * 0.2408467;
    private final double venusYear = earthYear * 0.61519726;
    private final double marsYear = earthYear * 1.8808158;
    private final double jupiterYear = earthYear * 11.862615;
    private final double saturnYear = earthYear * 29.447498;
    private final double uranusYear = earthYear * 84.016846;
    private final double neptuneYear = earthYear * 164.79132;

    private final double seconds;
    SpaceAge(double seconds) {
        this.seconds = seconds;
    }
    double getSeconds() {
        return seconds;
    }
    double onEarth() {
        return seconds / earthYear;
    }
    double onMercury() {
        return seconds / mercuryYear;
    }
    double onVenus() {
        return seconds / venusYear;
    }
    double onMars() {
        return seconds / marsYear;
    }
    double onJupiter() {
        return seconds / jupiterYear;
    }
    double onSaturn() {
        return seconds / saturnYear;
    }
    double onUranus() {
        return seconds / uranusYear;
    }
    double onNeptune() {
        return seconds / neptuneYear;
    }
}
