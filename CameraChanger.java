package Architecture.ModelElements;

public class CameraChanger implements Changer<Camera>{

    @Override
    public void rotate(Camera camera, Integer rotationGradeVertical, Integer rotationHorizontal) {
        camera.rotateCamera(rotationGradeVertical, rotationHorizontal);
    }

    @Override
    public void move(Camera camera, Integer locationPointX, Integer locationPointY, Integer locationPointZ) {
        camera.moveCamera(locationPointX, locationPointY, locationPointZ);
        
    }

}
