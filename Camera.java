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

    public void rotateCamera(Integer rotationGradeVertical, Integer rotationHorizontal){
        this.rotationVertical = rotationGradeVertical;
        this.rotationHorizontal = rotationHorizontal;
    }

    public void moveCamera(Integer locationPointX, Integer locationPointY, Integer locationPointZ){
        this.locationPointX = locationPointX;
        this.locationPointY = locationPointY;
        this.locationPointZ = locationPointZ;
    }

}
