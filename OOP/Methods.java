class MusicPlayer {
    public void Play() {
        System.out.println("Music is playing...");
    }

    public String getMusic(int cost) {

        if (cost >= 10)
            return "No Flex";

        return "Nothing";
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(double d1, int i1) {
        return d1 + i1;
    }

}

public class Methods {
    public static void main(String a[]) {

        MusicPlayer mp = new MusicPlayer();

        mp.Play();
        System.out.println(mp.getMusic(7));

        System.out.println(mp.add(56.88, 56));
        System.out.println(mp.add(67, 89, 34));

        

    }

}