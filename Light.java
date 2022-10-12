package Architecture.ModelElements;

public class Light {
    String color;
    Integer brightness;
    Integer locationPointX;
    Integer locationPointY;
    Integer locationPointZ;
    
    public Light(String color, Integer brightness, Integer locationPointX, Integer locationPointY,
            Integer locationPointZ) {
        this.color = color;
        this.brightness = brightness;
        this.locationPointX = locationPointX;
        this.locationPointY = locationPointY;
        this.locationPointZ = locationPointZ;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }


    public void moveLight(Integer locationPointX, Integer locationPointY, Integer locationPointZ) {
        this.locationPointX = locationPointX;
        this.locationPointY = locationPointY;
        this.locationPointZ = locationPointZ;
    }
    
}
