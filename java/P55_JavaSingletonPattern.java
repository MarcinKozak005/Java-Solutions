public class P55_JavaSingletonPattern {
    class Singleton{
        public String str;
        private static Singleton s;
        
        private Singleton(){}
        public static Singleton getSingleInstance(){
            if(s==null) s = new Singleton();
            return s;
        }
        
    }
}
