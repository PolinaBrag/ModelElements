package Architecture.ModelElements;

interface Changer<T> {

    void rotate(T object, Integer rotationGradeVertical, Integer rotationHorizontal);

    void move(T object, Integer locationPointX, Integer locationPointY, Integer locationPointZ);


}
