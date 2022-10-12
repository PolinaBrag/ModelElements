package Architecture.ModelElements;

public class Camera {
    
    Integer locationPointX;
    Integer locationPointY;
    Integer locationPointZ;
    Integer rotationVertical;
    Integer rotationHorizontal;
    Integer zoom;
    
    public Camera(Integer locationPointX, Integer locationPointY, Integer locationPointZ, Integer rotationVertical,
            Integer rotationHorizontal, Integer zoom) {
        this.locationPointX = locationPointX;
        this.locationPointY = locationPointY;
        this.locationPointZ = locationPointZ;
        this.rotationVertical = rotationVertical;
        this.rotationHorizontal = rotationHorizontal;
        this.zoom = zoom;
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
    
    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

}
