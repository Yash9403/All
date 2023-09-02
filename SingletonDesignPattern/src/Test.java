public class Test {

    private static Test t;

    private Test()
    {

    }

    public static Test createInstance()
    {
        if(t == null){
            return t = new Test();
        }
        return t;
    }



}
