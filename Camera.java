package Architecture.ModelElements;

public class Camera {
    
    Integer locationPointX;
    Integer locationPointY;
    Integer locationPointZ;
    Integer rotationVertical;
    Integer rotationHorizontal;
    
    public Camera(Integer locationPointX, Integer locationPointY, Integer locationPointZ, Integer rotationVertical,
            Integer rotationHorizontal) {
        this.locationPointX = locationPointX;
        this.locationPointY = locationPointY;
        this.locationPointZ = locationPointZ;
        this.rotationVertical = rotationVertical;
        this.rotationHorizontal = rotationHorizontal;
    }

    public void setLocationPointX(Integer locationPointX) {
        this.locationPointX = locationPointX;
    }

    public void setLocationPointY(Integer locationPointY) {
        this.locationPointY = locationPointY;
    }

    public void setLocationPointZ(Integer locationPointZ) {
        this.locationPointZ = locationPointZ;
    }

    public void setRotationVertical(Integer rotationVertical) {
        this.rotationVertical = rotationVertical;
    }

    public void setRotationHorizontal(Integer rotationHorizontal) {
        this.rotationHorizontal = rotationHorizontal;
    }




}
