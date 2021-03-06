package chapter8;

public class Beaver extends Rodent{
    public Beaver() {
        super(5);
    }

    public void myCallToFloat(Float f){}

    /*
    @Override
    public void parameterCovariant(String s){}
    */

    /*
    @Override
    public void deneme(Object o){}
    */
    
    @Override
    public Integer drill() throws RuntimeException{
        System.out.println("Beaver is drilling");
        return  2;
    }

    //static keyword olmadan static metodu override edemezsin
    /*
    public Integer chew() throws RuntimeException{
        System.out.println("Beaver is chewing");
        return 2;
    }
     */

    public static void main(String[] args) {
        Rodent rodent = new Beaver();
        Rodent r = new Rodent(2);


        Beaver beaver = new Beaver();
        beaver.myCallToFloat((float) 0.8); //only 0.8 DNC

        System.out.println(rodent.drill());
        System.out.println(r.drill());
    }
}
