package Architecture.ModelElements;

public class ModelStore {
    
    PoligonalModel model;
    Light light;
    Scene scene;
    Camera camera;

    public ModelStore(PoligonalModel model, Light light, Scene scene, Camera camera) {
        this.model = model;
        this.light = light;
        this.scene = scene;
        this.camera = camera;
    }

    public Integer getScene(ModelStore model) {
        return model.scene.id;
    }



    
}
