 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String stars = "";
        for(int i = 1;i<=numberOfStars;i++){
            stars = stars + "*";
        }
        
        return stars;
    }
    
    public static String getTriangle(int numberOfRows) {
        String stars = "";
        for (int j = 1; j<=numberOfRows;j++)
    {
        for(int i = 1; i<=j;i++)
        {
        stars = stars + "*";
        }
        stars = stars + "\n";
    }
        return stars;
    }


    public static String getSmallTriangle() {
        String stars = "";
        for (int j = 1; j<=4;j++)
    {
        for(int i = 1; i<=j;i++)
        {
        stars = stars + "*";
        }
        stars = stars + "\n";
    }
        return stars;
    }

    public static String getLargeTriangle() {
        String stars = "";
        for (int j = 1; j<=9;j++)
    {
        for(int i = 1; i<=j;i++)
        {
        stars = stars + "*";
        }
        stars = stars + "\n";
    }
        return stars;
    }
}
