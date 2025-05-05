package Interfaces;

public class Rectangle implements ToString
{
    int width, height;

    public Rectangle(int _width, int _height)
    {
        width = _width;
        height = _height;
    }

    public String ToString()
    {
        String str = "";

        for (int y = 0; y < height; y++)
        {
            str += "#";
            for (int x = 0; x < width; x++)
            {
                if (y != 0 && y != height - 1)
                    str += " ";
                else
                    str += "#";
            }
            str += "#\n";
        }

        return str;
    }
}
