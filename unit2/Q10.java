import java.util.*;

class SuperHero {
    String name;
    String abilities[];
    String original_name;

    SuperHero(String naam, String kaam[], String naam1) {
        name = naam;
        abilities = kaam;
        original_name = naam1;
    }

    SuperHero(String kaam[], String naam1) {
        abilities = kaam;
        original_name = naam1;
    }

    SuperHero(String naam, String kaam[]) {
        name = naam;
        abilities = kaam;
    }

    void getName() {
        System.out.println("Name -> " + name);
    }

    void getSecret() {
        System.out.println("Real name -> " + original_name);
    }
    
    void getPowers() {
        System.out.println("Abilities -> " + Arrays.toString(abilities));
    }
}

class Q10 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        SuperHero s1 = new SuperHero("Iron Man", new String[]{"Tech", "Humor", "Money", "Intelligence"}, "Tony Stark");
        SuperHero s2 = new SuperHero(new String[]{"Intelligence", "Humor", "Spidy Sense", "Super Human Strenght"}, "Peter Parker");
        SuperHero s3 = new SuperHero("Doctor Strange", new String[]{"Magic", "Doctor"}, "Stephen Vincent Strange");
        s2.getSecret();
        System.out.println();
        s1.getName();
        System.out.println();
        s3.getPowers();
    }
}
