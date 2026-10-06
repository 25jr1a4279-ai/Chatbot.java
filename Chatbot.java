import java.util.Scanner;

public class Chatbot {

    // Method to generate chatbot response
    public static String getResponse(String input) {

        input = input.toLowerCase().trim();

        // Greetings
        if (input.contains("hello") || input.contains("hi") || input.contains("hey")) {
            return "Hello! How can I help you?";
        }

        // Asking about chatbot
        else if (input.contains("who are you")) {
            return "I am a Java-based chatbot created using rule-based NLP.";
        }

        // Asking about Java
        else if (input.contains("what is java") || input.contains("java")) {
            return "Java is a popular object-oriented programming language.";
        }

        // Asking about NLP
        else if (input.contains("what is nlp") || input.contains("nlp")) {
            return "NLP stands for Natural Language Processing. It helps computers understand human language.";
        }

        // Asking about machine learning
        else if (input.contains("machine learning")) {
            return "Machine Learning allows computers to learn patterns from data and make predictions.";
        }

        // Asking how the chatbot is
        else if (input.contains("how are you")) {
            return "I am fine! Thanks for asking.";
        }

        // Asking what chatbot can do
        else if (input.contains("what can you do")) {
            return "I can answer frequently asked questions using predefined rules.";
        }

        // Thank you
        else if (input.contains("thank you") || input.contains("thanks")) {
            return "You're welcome!";
        }

        // Exit
        else if (input.contains("bye") || input.contains("exit")) {
            return "Goodbye! Have a nice day.";
        }

        // Default response
        else {
            return "Sorry, I don't understand that question.";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("       JAVA CHATBOT");
        System.out.println("=================================");
        System.out.println("Chatbot: Hello! I am your chatbot.");
        System.out.println("Chatbot: Type 'bye' or 'exit' to stop.");
        System.out.println();

        while (true) {

            System.out.print("You: ");
            String userInput = scanner.nextLine();

            String response = getResponse(userInput);

            System.out.println("Chatbot: " + response);

            // Stop the program
            if (userInput.toLowerCase().contains("bye") ||
                userInput.toLowerCase().contains("exit")) {
                break;
            }
        }

        scanner.close();
    }
}