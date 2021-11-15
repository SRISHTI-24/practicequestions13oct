public abstract class instrument {
    public abstract void play();
}
class piano extends instrument
{
    public void play()
    {
        System.out.println("piano is playing tan tan tan tan....");
    }
}
class flute extends instrument
{
    public void play()
    {
        System.out.println("flute is playing toot toot toot toot.... ");
    }
}
class guitar extends instrument
{
    public void play()
    {
        System.out.println("guitar is playing tin tin tin tin....");
    }
}
class test
{
    public static void main(String[] args) {
        instrument a[] = new instrument[10];
        for (int i = 0; i < 10; i++) {
            switch (i % 3) {
                case 0:
                    a[i] = new piano();
                    break;
                case 1:
                    a[i] = new flute();
                    break;
                case 2:
                    a[i] = new guitar();
                    break;
            }
        }
        for (int i = 0; i < 10; i++) {
            a[i].play();
            if (a[i] instanceof piano) {
                System.out.println("piano");
            }
            if (a[i] instanceof flute) {
                System.out.println("flute");
            }
            if (a[i] instanceof guitar) {
                System.out.println("guitar");
            }
        }
    }

    }


