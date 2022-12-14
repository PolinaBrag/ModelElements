package Architecture.ModelElements;

public class Light {
    String color;
    Integer brightness;
    Integer locationPointX;
    Integer locationPointY;
    Integer locationPointZ;
    Integer rotationVertical;
    Integer rotationHorizontal;
    
    public Light(String color, Integer brightness, Integer locationPointX, Integer locationPointY,
            Integer locationPointZ, Integer rotationVertical, Integer rotationHorizontal) {
        this.color = color;
        this.brightness = brightness;
        this.locationPointX = locationPointX;
        this.locationPointY = locationPointY;
        this.locationPointZ = locationPointZ;
        this.rotationVertical = rotationVertical;
        this.rotationHorizontal = rotationHorizontal;
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
    
    public void rotateLight(Integer rotationGradeVertical, Integer rotationHorizontal){
        this.rotationVertical = rotationGradeVertical;
        this.rotationHorizontal = rotationHorizontal;
    }
}
