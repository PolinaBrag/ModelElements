package Architecture.ModelElements;

public class GraphEditorApp {
    public static void main(String[] args) {
        
        PoligonalModel model = new PoligonalModel("test model");
        Light light = new Light("white", 150, 150, 130, 200, 180, 180);
        Scene scene = new Scene("new scene", 1);
        Camera camera = new Camera(200, 130, 250, 350, 500, 30);

        ModelStore newModel = new ModelStore(model, light, scene, camera);
        CameraChanger cc = new CameraChanger();
        LightChanger lc = new LightChanger();

        lc.move(newModel, 330, 544, 500);
        lc.rotate(newModel, 360, 360);

        cc.move(camera, 520, 120, 100);
        cc.rotate(camera, 360, 360);
        
        newModel.light.setColor("blue");
        newModel.light.setBrightness(500);

        newModel.model.setPoligonalModelTexture(new Texture("new texture"));
        newModel.model.setPoligonalModelPoligon(new Poligon(320, 320, 320));


    }
    
}
