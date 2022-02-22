package RandomExamples;

public class MathRandomExample {
	public static int rand(int min, int max)
    {
        if (min > max) {
            throw new IllegalArgumentException("Invalid range");
        }
 
        double rand = Math.random();
        return (int)(rand * ((max - min) + 1)) + min;
    }
 
    public static void main(String[] args)
    {
        int min = 1, max = 10;
 
        for (int i = 0; i < 10; i++) {
            System.out.println(rand(min, max));
        }
    }
}
