package Rogertheone.team.service;


public class Data {
    public static final int NBAplayer = 1;
    public static final int Starter = 2;
    public static final int AllStar = 3;
    public static final int SuperStar = 4;

    public static final int guard = 21;
    public static final int forward = 22;
    public static final int center = 23;

    //NBA Player:  1, id, name, age, team, position
    //Starter:  2, id, name, age, team, position, salary
    //All-star:  3, id, name, age, team, position, salary, all-star game attended
    //Super Star:  4, id, name, age, team, position, salary, all-star game attended, championship
    public static final String[][] Players = {
        {"1", "1", "\tSteven Adams", "29", "Grizzlies", "Center\t\t\t"},
        {"4", "2", "\tLebron James", "37", "Lakers\t", "Small Forward\t", "\t\t40m", "19 times", "4"},
        {"2", "3", "\tRJ Barrett\t", "23", "Knicks\t", "Shooting Guard\t", "\t20m"},
        {"1", "4", "\tAlex Caruso\t", "29", "Bulls\t", "Point Guard\t\t"},
        {"3", "5", "\tJimmy Butler", "33", "Heat\t", "Small Forward\t", "\t\t30m", "6 times"},
        {"2", "6", "\tBrandon Clarke", "26", "Grizzlies", "Power Forward\t", "\t\t\t4m"},
        {"2", "7", "\tIvica Zubac\t", "26", "Clippers","Center\t\t\t", "\t10m"},
        {"4", "8", "\tKevin Durant", "34", "Suns\t", "Small Forward\t", "\t\t\t40m", "13 times", "2"},
        {"3", "9", "\tChris Paul\t", "38", "Warriors", "Point Guard\t\t", "\t30m", "12 times"},
        {"3", "10", "\tJaylen Brown", "26", "Celtics\t", "Shooting Guard\t", "\t20m", "2 times"},
        {"4", "11", "\tNikola Jokic", "28", "Nuggets\t", "Center\t\t\t", "30m", "5 times\t", "1"},
        {"1", "12", "\tJohn Collins", "25", "Jazz\t", "Power Forward\t"}
    };

    //Guard  : 11, shoes, model
    //Forward: 12, shoes, model
    //Center : 13, shoes, model
    public static final String[][] Accessories = {
        {"23", "New Balance", "Two Wxy V3"},
        {"22", "Nike", "Lebron 20"},
        {"21", "Puma", "Fusion Nitro"},
        {"21", "Anta", "Shock the game 6.0"},
        {"22", "Li-Ning", "JB1"},
        {"22", "Nike", "KD 15"},
        {"23", "Adidas", "D.O.N Issue"},
        {"22", "Nike", "KD 15"},
        {"21", "Air Jordan", "CP3.12"},
        {"21", "Nike", "Kobe 6 Protro"},
        {"23", "Nike","Air Zoom G.T.Jump"},
        {"22", "Adidas", "adiZero Rose 1.5"}
    };
}
