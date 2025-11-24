package java17;

public class TextBlocks {
    public static void main(String[] args) {
        // Before java17

        // You can't store json or xml response as it is in readable format when keeping inside ""
        String s1 = "{employees\": [ {\"firstName\": \"John\"}, {\"firstName\": \"Anna\"} ]}";

        // Java17
        String s2 = """
                {employees": [ {"firstName": "John"}, {"firstName": "Anna"} ]}
                """;

        System.out.println(s1);

        System.out.println(s2);

    }
}
