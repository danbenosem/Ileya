import java.util.ArrayList; 
import java.util.Scanner;

public class Mtbi {



    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> extroIntro = new ArrayList<>();
        ArrayList<String> sensingIntuition = new ArrayList<>();
        ArrayList<String> thinkingFeeling = new ArrayList<>();
        ArrayList<String> judgingPerceping = new ArrayList<>();
        String options;

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = inputCollector.nextLine();
        names.add(name);

        System.out.println("For the following Questions choose option A or B\n");

        // EXTRAVERSION   INTROVERSION 

        System.out.println("1. How do you prefer to recharge your energy?");
        System.out.println("   A) Spending time with a lively group of people.");
        System.out.println("   B) Spending quiet time alone or with one close friend.");

        options = inputCollector.nextLine();

        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            extroIntro.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    extroIntro.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        System.out.println("\n2. When working through a complex problem, do you usually:");
        System.out.println("   A) Talk it out loud with others to process it.");
        System.out.println("   B) Think it through quietly by yourself first.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            extroIntro.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    extroIntro.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        System.out.println("\n3. In your social life, you tend to have:");
        System.out.println("   A) A wide network of many acquaintances.");
        System.out.println("   B) A small, close-knit circle of deep friendships.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            extroIntro.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    extroIntro.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        System.out.println("\n4. When you enter a room full of strangers, you generally:");
        System.out.println("   A) Feel energized and strike up conversations easily.");
        System.out.println("   B) Feel drained and stick to people you already know.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            extroIntro.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    extroIntro.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        System.out.println("\n5. During group projects, your preferred role is to:");
        System.out.println("   A) Lead the discussion and vocalize ideas immediately.");
        System.out.println("   B) Listen carefully and share your thoughts after reflecting.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            extroIntro.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    extroIntro.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        // SENSING vs INTUITION

        System.out.println("\n6. Which type of information do you trust more?");
        System.out.println("   A) Concrete facts, real data, and past experience.");
        System.out.println("   B) Abstract theories, future possibilities, and hunches.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            sensingIntuition.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    sensingIntuition.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        System.out.println("\n7. When tackling a new task, do you prefer to:");
        System.out.println("   A) Follow a proven, step-by-step method.");
        System.out.println("   B) Invent your own unique way of doing it.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            sensingIntuition.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    sensingIntuition.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }


        System.out.println("\n8. Where does your mind spend most of its time?");
        System.out.println("   A) Grounded in the present moment and physical reality.");
        System.out.println("   B) Wandering into the future and big-picture concepts.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            sensingIntuition.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    sensingIntuition.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        System.out.println("\n9. When reading a book or watching a movie, you prefer:");
        System.out.println("   A) A straightforward, realistic storyline.");
        System.out.println("   B) A plot filled with deep symbolism and hidden meanings.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            sensingIntuition.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    sensingIntuition.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        System.out.println("\n10. People would most likely describe you as:");
        System.out.println("    A) Practical and highly observant of details.");
        System.out.println("    B) Creative and focused on imaginative ideas.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            sensingIntuition.add(options);
        }  else {
               while (true) {
                    if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                         sensingIntuition.add(options);
                        break;
                    }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        // THINKING FEELING 

        System.out.println("\n11. When making an important decision, you prioritize:");
        System.out.println("A) Cold logic, objective principles, and pros/cons.");
        System.out.println("B) Personal values, emotions, and impact on people.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            thinkingFeeling.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    thinkingFeeling.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        System.out.println("\n12. When giving feedback to someone, you prefer to be:");
        System.out.println(" A) Completely honest and direct, even if it hurts.");
        System.out.println(" B) Gentle and tactful, prioritizing their feelings.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            thinkingFeeling.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    thinkingFeeling.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }
        
        System.out.println("\n13. In a disagreement, what bothers you more?");
        System.out.println(" A) Flawed logic and irrational arguments.");
        System.out.println(" B) Harsh tones and lack of empathy.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            thinkingFeeling.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    thinkingFeeling.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }
        
        System.out.println("\n14. When solving a conflict between friends, your goal is:");
        System.out.println(" A) Achieving a fair, objective, and correct outcome.");
        System.out.println(" B) Maintaining peace, harmony, and emotional support.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            thinkingFeeling.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    thinkingFeeling.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        System.out.println("\n15. Which virtue do you value more highly?");
        System.out.println(" A) Justice and fairness.");
        System.out.println(" B) Compassion and empathy.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            thinkingFeeling.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    thinkingFeeling.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        // JUDGING  PERCEIVING 

        System.out.println("\n16. How do you feel about following a strict daily routine?");
        System.out.println(" A) Comforted; it helps me stay organized.");
        System.out.println(" B) Trapped; it limits my freedom and flexibility.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            judgingPerceping.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    judgingPerceping.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        System.out.println("\n17. When faced with a looming deadline, do you usually:");
        System.out.println(" A) Finish the work early to avoid stress.");
        System.out.println(" B) Work best at the last minute under pressure.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            judgingPerceping.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    judgingPerceping.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        System.out.println("\n18. What does your typical workspace or bedroom look like?");
        System.out.println(" A) Neat and organized, with everything in its place.");
        System.out.println(" B) Casually cluttered, but I know where things are.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            judgingPerceping.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    judgingPerceping.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        System.out.println("\n19. When planning a vacation, you prefer to:");
        System.out.println(" A) Book everything in advance and build a detailed itinerary.");
        System.out.println(" B) Pack bags and go with the flow without a strict plan.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            judgingPerceping.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    judgingPerceping.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }

        System.out.println("\n20. Which state of mind makes you feel more comfortable?");
        System.out.println(" A) Having things decided, finalized, and settled.");
        System.out.println(" B) Keeping options open so I can change my mind.");
        options = inputCollector.nextLine();
        if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
            judgingPerceping.add(options);
        } else {
            while (true) {
                if (options.equalsIgnoreCase("A") || options.equalsIgnoreCase("B")) {
                    judgingPerceping.add(options);
                    break;
                }
                System.out.println("Invalid input. Enter the correct option (A or B):");
                options = inputCollector.nextLine();
            }
        }


        String[] extroIntroA = {
            "Spending time with a lively group of people.",
            "Talk it out loud with others to process it.",
            "A wide network of many acquaintances.",
            "Feel energized and strike up conversations easily.",
            "Lead the discussion and vocalize ideas immediately."
        };

        String[] extroIntroB = {
            "Spending quiet time alone or with one close friend.",
            "Think it through quietly by yourself first.",
            "A small, close-knit circle of deep friendships.",
            "Feel drained and stick to people you already know.",
            "Listen carefully and share your thoughts after reflecting."
        };

        String[] sensingIntuitionA = {
            "Concrete facts, real data, and past experience.",
            "Follow a proven, step-by-step method.",
            "Grounded in the present moment and physical reality.",
            "A straightforward, realistic storyline.",
            "Practical and highly observant of details."
        };

        String[] sensingIntuitionB = {
            "Abstract theories, future possibilities, and hunches.",
            "Invent your own unique way of doing it.",
            "Wandering into the future and big-picture concepts.",
            "A plot filled with deep symbolism and hidden meanings.",
            "Creative and focused on imaginative ideas."
        };

        String[] thinkingFeelingA = {
            "Cold logic, objective principles, and pros/cons.",
            "Completely honest and direct, even if it hurts.",
            "Flawed logic and irrational arguments.",
            "Achieving a fair, objective, and correct outcome.",
            "Justice and fairness."
        };

        String[] thinkingFeelingB = {
            "Personal values, emotions, and impact on people.",
            "Gentle and tactful, prioritizing their feelings.",
            "Harsh tones and lack of empathy.",
            "Maintaining peace, harmony, and emotional support.",
            "Compassion and empathy."
        };

        String[] judgingPercepingA = {
            "Comforted; it helps me stay organized.",
            "Finish the work early to avoid stress.",
            "Neat and organized, with everything in its place.",
            "Book everything in advance and build a detailed itinerary.",
            "Having things decided, finalized, and settled."
        };

        String[] judgingPercepingB = {
            "Trapped; it limits my freedom and flexibility.",
            "Work best at the last minute under pressure.",
            "Casually cluttered, but I know where things are.",
            "Pack bags and go with the flow without a strict plan.",
            "Keeping options open so I can change my mind."
        };

        System.out.println( "\nHello, " + names.get(0) + " you selected" + "\n");

        String personalityType = "";

        String letter1 = displaySectionCounts("Extraversion...", extroIntro, extroIntroA, extroIntroB, "E", "I");
        String letter2 = displaySectionCounts("Sensing...", sensingIntuition, sensingIntuitionA, sensingIntuitionB, "S", "N");
        String letter3 = displaySectionCounts("Thinking...", thinkingFeeling, thinkingFeelingA, thinkingFeelingB, "T", "F");
        String letter4 = displaySectionCounts("Judging...", judgingPerceping, judgingPercepingA, judgingPercepingB, "J", "P");

        personalityType = letter1 + letter2 + letter3 + letter4;

        System.out.println(" Your MBTI Personality Type is: " + personalityType);

    }

    public static String displaySectionCounts(String sectionName, ArrayList<String> sectionList, String[] optionA, String[] optionB, String letterA, String letterB)  {

        int countA=0;
        int countB=0;

        for(int index=0; index<sectionList.size(); index++){

            String userChoice = sectionList.get(index);
            
            
            if(userChoice.equalsIgnoreCase("A")){
                System.out.println(optionA[index]);
                countA++; 
            } else {
                System.out.println(optionB[index]);
                countB++; 
            }
        }

        System.out.println("for the section " + sectionName + "\n");
        System.out.println("Number of A selected: " + countA);
        System.out.println("Number of B selected: " + countB);
        System.out.println("\n\n");

        if (countA > countB) {
            return letterA;
        } else {
            return letterB;
        }
    }
}
