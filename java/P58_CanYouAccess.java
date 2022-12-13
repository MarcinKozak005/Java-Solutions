public class P58_CanYouAccess {
    public static void main(String[] args) throws Exception {
        DoNotTerminate.forbidExit();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
            // My code
            Inner i = new Inner();
            Class<?> privateClass = Inner.class.getDeclaredClasses()[0];
            Constructor<?> constructor = privateClass.getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            o = constructor.newInstance(i);
            Method m = privateClass.getDeclaredMethod("powerof2", int.class);
            m.setAccessible(true);
            System.out.println(num + " is " + m.invoke(o, num));
            // end of my code
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        }//end of try

        catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }//end of main
}
