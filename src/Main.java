public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("1_dog = " + dog);
        System.out.println("1_cat = " + cat);
        System.out.println("1_paper = " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("2_dog = " + dog);
        System.out.println("2_cat = " + cat);
        System.out.println("2_paper = " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("3_dog = " + dog);
        System.out.println("3_cat = " + cat);
        System.out.println("3_paper = " + paper);

        var friend = 19;
        System.out.println("4_friend = " + friend);

        friend = friend + 2;
        System.out.println("friend+2 = " + friend);

        friend = friend/7;
        System.out.println("friend/7 = " + friend);

        var frog = 3.5;
        System.out.println("5_frog = " + frog);

        frog = frog*10;
        System.out.println("frog*10 = " + frog);

        frog = frog/3.5;
        System.out.println("frog/3.5 = " + frog);

        frog = frog + 4;
        System.out.println("frog+4 = " + frog);

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;

        var sumWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общая масса бойцов = " + sumWeight);

        var diffWeight = boxer2Weight - boxer1Weight;
        System.out.println("Разница между массами бойцов = " + diffWeight);

        var remWeight = boxer2Weight%boxer1Weight;
        System.out.println("Остаток от деления =  " + remWeight);

        var allHourWork = 640;
        var oneHour = 8;
        var countWorker = allHourWork/oneHour;
        System.out.println("countWorker = " + countWorker);

    }


}