package Architecture.ModelElements;

public class LightChanger implements Changer<ModelStore>{

    @Override
    public void rotate(ModelStore model, Integer rotationGradeVertical, Integer rotationHorizontal) {
        model.light.rotateLight(rotationGradeVertical, rotationHorizontal);
    }

    @Override
    public void move(ModelStore model, Integer locationPointX, Integer locationPointY, Integer locationPointZ) {
        model.light.moveLight(locationPointX, locationPointY, locationPointZ);
    }
    
}
