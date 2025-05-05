package Interfaces;

public class Vector2 implements ToString
{
    public float x, y;

    public Vector2(float _x, float _y)
    {
        x = _x;
        y = _y;
    }

    public String ToString()
    {
        return "(" + x + ", " + y + ")";
    }
}
