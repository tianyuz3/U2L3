public class Letter {
    /** Prints out a complete letter by printing the greeting,
     Followed by the special message, followed by the closing */
private String fromName;
    public String writeLetter(String fromName)
    {
        System.out.println(greeting(fromName));
        specialMessage();
        closing();
    }

    public String greeting(String fromName)
    {
        String greet="Hello,"+ fromName+ "!";
                return greet;
    }

    public void specialMessage()
    {
        System.out.println("Java is pretty cool, wouldn’t you say?");
    }

    public void closing()
    {
        System.out.println("See you later!");
    }
}




